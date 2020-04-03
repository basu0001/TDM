import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { Terminaldata } from 'src/app/models/terminaldata';
import { CommonService } from 'src/app/services/common.service';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';



export interface Server {
  value: string;
  viewValue: string;
}

export interface App {
  value: string;
  viewValue: string;
}

export interface Trml {
  value: string;
  viewValue: string;
}

export interface Loc { 
  value: string;
  viewValue: string;
}

export interface Admn { 
  value: string;
  viewValue: string;
}

export interface Feature {
  value: string;
  viewValue: string;
}

export interface Tfreq {
  value: string;
  viewValue: string;
}

export interface Trange {
  value: string;
  viewValue: string;
}
export interface Poskey {
  value: string;
  viewValue: string;
}


@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {

  dispTerminal:FormControl;
  
  modifyForm: FormGroup;
  Terminals:Terminaldata;
  chosenTerminal:Terminaldata;

  constructor(private fb: FormBuilder, private commonService: CommonService, private datePipe: DatePipe, private router:Router) {
    this.dispTerminal= new FormControl();
    this.modifyForm = this.fb.group({dispTerminal:this.dispTerminal  });

  }
  resetForm(){
    alert("Are you sure to reset the form?");
    this.router.navigate(['./modif']);
    this.modifyForm.reset();
    // this.modifyForm.reload();
    
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
    this.chosenTerminal.terminalCode= $event.value.terminalCode;
    this.chosenTerminal.terminalId= $event.value.terminalId;
    this.chosenTerminal.locationId= $event.value.locationId;
    this.chosenTerminal.trmlSrvType= $event.value.trmlSrvType;
    this.chosenTerminal.terminalIp= $event.value.terminalIp;
    this.chosenTerminal.windowNumber= $event.value.windowNumber;
    this.chosenTerminal.validStatus= $event.value.validStatus;
    this.chosenTerminal.trmlSrvNumber= $event.value.trmlSrvNumber;
    this.chosenTerminal.adminId= $event.value.adminId;
    this.chosenTerminal.commissionDate= $event.value.commissionDate;
    this.chosenTerminal.updatedBy= $event.value.updatedBy;
    this.chosenTerminal.updatedOn= $event.value.updatedOn;
    
    this.chosenTerminal.terminalParameterUid= $event.value.terminalParameterUid;
    this.chosenTerminal.adminId= $event.value.adminId;
    this.chosenTerminal.commissionDate= $event.value.commissionDate;
    this.chosenTerminal.updatedBy= $event.value.updatedBy;
    this.chosenTerminal.updatedOn= $event.value.updatedOn;
    
    this.chosenTerminal.usageFrequencyType= $event.value.usageFrequencyType;
    this.chosenTerminal.usageFrequencyValue= $event.value.usageFrequencyValue;
    this.chosenTerminal.appId= $event.value.appId;
    this.chosenTerminal.name= $event.value.name;
    this.chosenTerminal.value= $event.value.value;
    this.chosenTerminal.mid= $event.value.mid;
    this.chosenTerminal.description= $event.value.description;
    this.chosenTerminal.posTid= $event.value.posTid;
    this.chosenTerminal.posMac= $event.value.posMac;
    this.chosenTerminal.posMake= $event.value.posMake;
    this.chosenTerminal.posBankCode= $event.value.posBankCode;
    this.chosenTerminal.terminalTimingUid= $event.value.terminalTimingUid;
    this.chosenTerminal.serialNumber= $event.value.serialNumber;
    // this.chosenTerminal.parameterId= $event.value.parameterId;
    this.chosenTerminal.posTrmlUid= $event.value.posTrmlUid;
    
    this.chosenTerminal.posKey= $event.value.posKey;
    this.chosenTerminal.terminalTypeId= $event.value.terminalTypeId;
    this.chosenTerminal.validUpto= $event.value.validUpto;
    this.chosenTerminal.validFrom= $event.value.validFrom;
    this.chosenTerminal.startDate= $event.value.startDate;
    this.chosenTerminal.endDate= $event.value.endDate;
    this.chosenTerminal.startTime= $event.value.startTime;
    this.chosenTerminal.endTime= $event.value.endTime;
    // this.chosenTerminal.terminalTypeName= $event.value.terminalTypeName ;
    // this.chosenTerminal.terminalTypeCode= $event.value.terminalTypeCode;
    this.chosenTerminal.commissionDate= $event.value.commissionDate;
    
    //this.chosenTerminal.terminalTimingUid= $event.value.terminalTimingUid;
    // console.log(" terminal code of the selected user is ="+this.chosenTerminal.terminalCode);
    // console.log(" terminal ID of the selected user is ="+this.chosenTerminal.terminalId);
    // this.chosenTerminalParameter = new Terminalparam();
    // this.chosenTerminalParameter.parameterId= $event.value.parameterId;

  }
 
  servers: Server[] = [
    {value: '1', viewValue: 'TCP/IP'},
    {value: '2', viewValue: 'ThinClient'},
    {value: '3', viewValue: 'DEC'}
  ];

  public selectedServer = 1;

  apps: App[] = [
    {value: '1', viewValue: 'UTS'},
    {value: '2', viewValue: 'PRS'},
  ]

  trmls: Trml[] = [
    {value: '1', viewValue: 'Manager'},
    {value: '2', viewValue: 'Database'},
    {value: '3', viewValue: 'Supervisor'},
    {value: '4', viewValue: 'Charting'},
    {value: '5', viewValue: 'Booking'},
    {value: '6', viewValue: 'Enquiry'},
  ]

  locs: Loc[] = [
    {value: 'SC', viewValue: 'SC - Secunderabad'},
    {value: 'TPTY', viewValue: 'TPTY - Tirupaty'},
    {value: 'RU', viewValue: 'RU - Renigunta'}
  ]

  features: Feature[] = [
    {value: '1', viewValue: 'UTS'},
    {value: '2', viewValue: 'Cash'},
    {value: '3', viewValue: 'Extended'}
  ]

  tfreqs: Tfreq[] = [
    {value: 'D', viewValue:'Daily'},
    {value: 'W', viewValue:'Weekly'},
    {value: 'M', viewValue:'Monthly'},
    {value: 'Y', viewValue:'Yearly'}
  ]

  admns: Admn[] = [
    {value: '1', viewValue:'Admin 1'},
    {value: '2', viewValue:'Admin 2'},
    {value: '3', viewValue:'Admin 3'},
    {value: '4', viewValue:'Admin 4'}
  ]

  tranges: Trange[] = [
    {value: 'MON', viewValue: 'Monday'},
    {value: 'TUE', viewValue: 'Tuesday'},
    {value: 'WED', viewValue: 'Wednesday'},
    {value: 'THU', viewValue: 'Thursday'},
    {value: 'FRI', viewValue: 'Friday'},
    {value: 'SAT', viewValue: 'Saturday'},
    {value: 'SUN', viewValue: 'Sunday'},
  ]

  poskeys: Poskey[] = [
    {value: '1', viewValue:'Key1'},
    {value: '2', viewValue:'Key2'},
    {value: '3', viewValue:'Key3'},
    {value: '4', viewValue:'Key4'}
  ]


  t_timings: number[] = [];
    
  createTimings(): void {
    this.t_timings.push(this.t_timings.length);
  }
  deleteTimings(): void {
    this.t_timings.pop();
  }

  p_details: number[] = [];
  createDetails(): void {
    this.p_details.push(this.p_details.length);
  }
  deleteDetails(): void {
    this.p_details.pop();
  }
  t_char1: number[] = [];

  // createChar1(): void {
  //   this.t_char1.push(this.t_char1.length);
  // }
  // deleteChar1(): void {
  //   this.t_char1.pop();
  // }
  // t_char2: number[] = [];

  // createChar2(): void {
  //   this.t_char2.push(this.t_char2.length);
  // }
  
  // deleteChar2(): void {
  //   this.t_char2.pop();
  // }
  
}
