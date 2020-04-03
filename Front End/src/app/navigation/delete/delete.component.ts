import { Postrmldetails } from './../../models/postrmldetails';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonService } from 'src/app/services/common.service';
import { DatePipe } from '@angular/common';
import { Terminaldata } from 'src/app/models/terminaldata';
import { Terminal } from 'src/app/models/terminal';
import { Terminalchar } from 'src/app/models/terminalchar';



@Component({
  selector: 'app-display',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  dispTerminal:FormControl;
  DisplayFormGroup:FormGroup;
  Terminals:Terminaldata;
  chosenTerminal:Terminaldata;
  terminal: Terminal;
  terminalchar: Terminalchar;
  postrmldetails: Postrmldetails;

  constructor(private fb: FormBuilder, private commonService: CommonService, private datePipe: DatePipe, private router:Router) {
    this.dispTerminal= new FormControl();
    this.DisplayFormGroup = this.fb.group({dispTerminal:this.dispTerminal  });

  }
  deleteTerminal(){
    alert("Are you sure to delete this terminal code?")
   
    this.terminal = new Terminal();
    this.terminalchar = new Terminalchar();
    this.postrmldetails = new Postrmldetails();
    // this.terminal.terminalId = this.chosenTerminal.terminalId;
    // this.terminal.terminalCode = this.chosenTerminal.terminalCode;
    // this.terminal.locationId = this.chosenTerminal.locationId;
    // this.terminal.trmlSrvNumber = this.chosenTerminal.trmlSrvNumber;
    // this.terminal.WindowNumber = this.chosenTerminal.windowNumber;
    // this.terminal.validStatus = 0;
    // this.terminal.adminId = this.chosenTerminal.adminId;
    // this.terminal.terminalIp = this.chosenTerminal.terminalIp;
    // this.terminal.trmlSrvType = this.chosenTerminal.trmlSrvType;
    // this.terminal.commissionDate = this.chosenTerminal.commissionDate;
    // this.terminal.updatedBy = 'alok';
    // this.terminal.updatedOn = new Date();
    // this.terminalchar.terminalParameterUid = this.chosenTerminal.terminalParameterUid;
    // this.terminalchar.appId = this.chosenTerminal.appId;
    this.terminal.terminalId = this.chosenTerminal.terminalId;
    this.terminal.validStatus = 0;
    this.terminalchar.trmlAppLocParamUid = this.chosenTerminal.trmlAppLocParamUid;
    this.terminalchar.validStatus = 0;
    this.postrmldetails.posTrmlUid = this.chosenTerminal.posTrmlUid;
    this.postrmldetails.validStatus = 0;
    
    this.commonService.updateTerminal(this.terminal.terminalId,this.terminal);
    this.commonService.updateTerminalParam(this.terminalchar.trmlAppLocParamUid,this.terminalchar);
    this.commonService.updatePosTrmlDetails(this.postrmldetails.posTrmlUid, this.postrmldetails);
    this.router.navigate(['./home']);
  }


  ngOnInit() {
    this.getTerminals();
  }

  getTerminals() 
  {
    //this.locationList=[];
    this.commonService.getTerminals().subscribe((Terminals: Terminaldata) => 
    {
      this.Terminals = Terminals;
      console.log(this.Terminals);
    });
  }

  showTerminal(){}

  selectedTerminal($event){
    console.log($event);
    console.log("assigining the selected terminal to the local object");

    this.chosenTerminal = new Terminaldata();
    this.chosenTerminal.terminalCode = $event.value.terminalCode;
    this.chosenTerminal.terminalId = $event.value.terminalId;
    this.chosenTerminal.locationId = $event.value.locationId;
    this.chosenTerminal.trmlSrvType = $event.value.trmlSrvType;
    this.chosenTerminal.terminalIp = $event.value.terminalIp;
    this.chosenTerminal.windowNumber = $event.value.windowNumber;
    this.chosenTerminal.validStatus = $event.value.validStatus;
    this.chosenTerminal.trmlSrvNumber = $event.value.trmlSrvNumber;
    this.chosenTerminal.adminId = $event.value.adminId;
    this.chosenTerminal.commissionDate = $event.value.commissionDate;
    this.chosenTerminal.updatedBy = $event.value.updatedBy;
    this.chosenTerminal.updatedOn = $event.value.updatedOn;
    this.chosenTerminal.terminalParameterUid = $event.value.terminalParameterUid;
    this.chosenTerminal.commissionDate = $event.value.commissionDate;
    this.chosenTerminal.usageFrequencyType = $event.value.usageFrequencyType;
    this.chosenTerminal.usageFrequencyValue = $event.value.usageFrequencyValue;
    this.chosenTerminal.appId = $event.value.appId;
    this.chosenTerminal.name = $event.value.name;
    this.chosenTerminal.value = $event.value.value;
    this.chosenTerminal.mid = $event.value.mid;
    this.chosenTerminal.description = $event.value.description;
    this.chosenTerminal.posTid = $event.value.posTid;
    this.chosenTerminal.posMac = $event.value.posMac;
    this.chosenTerminal.posMake = $event.value.posMake;
    this.chosenTerminal.posBankCode = $event.value.posBankCode;
    this.chosenTerminal.terminalTimingUid = $event.value.terminalTimingUid;
    this.chosenTerminal.serialNumber = $event.value.serialNumber;
    this.chosenTerminal.posTrmlUid = $event.value.posTrmlUid;
    this.chosenTerminal.posKey = $event.value.posKey;
    this.chosenTerminal.terminalTypeId = $event.value.terminalTypeId;
    this.chosenTerminal.validUpto = $event.value.validUpto;
    this.chosenTerminal.validFrom = $event.value.validFrom;
    this.chosenTerminal.startDate = $event.value.startDate;
    this.chosenTerminal.endDate = $event.value.endDate;
    this.chosenTerminal.startTime = $event.value.startTime;
    this.chosenTerminal.endTime = $event.value.endTime;
    this.chosenTerminal.commissionDate = $event.value.commissionDate;
    this.chosenTerminal.paramType = $event.value.paramType;
    this.chosenTerminal.trmlAppLocParamUid = $event.value.trmlAppLocParamUid;
    // console.log(" terminal code of the selected user is ="+this.chosenTerminal.terminalCode);
    // console.log(" terminal ID of the selected user is ="+this.chosenTerminal.terminalId);
    // this.chosenTerminalParameter = new Terminalparam();
    // this.chosenTerminalParameter.parameterId= $event.value.parameterId;

  } 

 
}
