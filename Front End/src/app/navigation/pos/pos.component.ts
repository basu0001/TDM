import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { CommonService } from '../../services/common.service';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';
import { Pos } from '../../models/pos';


export interface Make { 
  value: string;
  viewValue: string;
}

export interface Bank { 
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-pos',
  templateUrl: './pos.component.html',
  styleUrls: ['./pos.component.css']
})
export class PosComponent implements OnInit {

  posCreateForm: FormGroup;
  merchantId: FormControl;
  posTrmlId: FormControl;
  posMacId: FormControl;
  posMake: FormControl;
  posBankCode: FormControl;
  posServiceProvider: FormControl;
  postime: FormControl;

  newPos: Pos;
  posTerminal: Pos;

  constructor(private fb: FormBuilder, private commonService: CommonService, private datePipe: DatePipe, private router:Router) { 


    this.merchantId = new FormControl();
    this.posTrmlId = new FormControl();
    this.posMacId = new FormControl();
    this.posMake = new FormControl();
    this.posBankCode = new FormControl();
    this.posServiceProvider = new FormControl();
    this.postime = new FormControl();

    this.posCreateForm = this.fb.group({
      merchantId: this.merchantId,
      posTrmlId: this.posTrmlId,
      posMacId: this.posMacId,
      posMake: this.posMake,
      posBankCode: this.posBankCode,
      posServiceProvider: this.posServiceProvider,
      postime: this.postime,
    })

 
  }


  createPos(){
      this.newPos = new Pos;
      this.newPos.mid = this.merchantId.value;
      this.newPos.posTid = this.posTrmlId.value;
      this.newPos.posMac = this.posMacId.value;
      this.newPos.posMake = this.posMake.value;
      this.newPos.posBankCode = this.posBankCode.value;
      this.newPos.serviceProviderCode = this.posServiceProvider.value;
      this.newPos.validStatus = 1;
      this.newPos.updatedBy = 'cris_hyd';
      this.newPos.updatedOn = new Date();
      this.newPos.validFrom = new Date();
      this.newPos.validUpto = new Date();
      this.commonService.createPosTerminal(this.newPos).subscribe((posTerminal: Pos) => 
    {
      this.posTerminal = posTerminal;
      console.log(this.posTerminal);
    });
  }

  resetPos(){
    alert("Are you sure to reset the fields?")
    this.posCreateForm.reset();
  }

  ngOnInit() {
  }

  banks: Bank[] = [
    {value: 'SBI', viewValue: 'SBI'},
    {value: 'HDFC', viewValue: 'HDFC'},
    {value: 'ICICI', viewValue: 'ICICI'}
  ];

  makes: Make[] = [
    {value: 'VRF', viewValue: 'Verifone'},
    {value: 'AGS', viewValue: 'AGS'},
  ]

}
