import { Postrmldetails } from './../../models/postrmldetails';
import { CommonService } from 'src/app/services/common.service';
import { Component, OnInit, Input, Output } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';
import { Terminal } from '../../models/terminal';
import { Terminalchar } from '../../models/terminalchar';
import { Terminaltimings } from '../../models/terminaltimings';


export interface Server {
  value: string;
  viewValue: string;
}

export interface App {
  value: number;
  viewValue: string;
}

export interface Trml {
  value: string;
  viewValue: string;
}

export interface Loc { 
  value: number;
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
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  createForm : FormGroup;
  terminalCode: FormControl;
  trmlSrvType: FormControl;
  locationId: FormControl;
  terminalIp: FormControl;
  trmlWindowNumber: FormControl;
  trmlSrvNumver: FormControl;
  adminId: FormControl;
  commissionDate: FormControl;
  appId: FormControl;
  terminalFeature: FormControl;
  trmlFeatValue: FormControl;
  trmlFromDate: FormControl;
  trmlToDate: FormControl;
  trmlFrequency: FormControl;
  trmlFrequencyRange: FormControl;
  trmlStartDate: FormControl;
  trmlEndDate: FormControl;
  trmlStartTime: FormControl;
  trmlEndTime: FormControl;
  posKey: FormControl;
  posStartDate: FormControl;
  posEndDate: FormControl;

  
  terminal: Terminal;
  terminalchar: Terminalchar;
  terminaltime: Terminaltimings;
  postrmldetails: Postrmldetails;
  newTerminal: Terminal;
  newTerminalChar: Terminalchar;
  newTerminalTime: Terminaltimings;
  newPosTrmlDetails: Postrmldetails;
  
  // newPosTerminal: Pos;

  constructor(private fb: FormBuilder, private commonService: CommonService, private datePipe: DatePipe, private router:Router) {
    
    // this.terminalCode = new FormControl();
    // this.trmlSrvType = new FormControl();
    this.terminalCode = new FormControl();
    this.trmlSrvType = new FormControl();
    this.locationId = new FormControl();
    this.terminalIp = new FormControl();
    this.trmlWindowNumber = new FormControl();
    this.trmlSrvNumver = new FormControl();
    this.adminId = new FormControl();
    this.commissionDate = new FormControl();
    this.appId = new FormControl();
    this.terminalFeature = new FormControl();
    this.trmlFeatValue = new FormControl();
    this.trmlFromDate = new FormControl();
    this.trmlToDate = new FormControl();
    this.trmlFrequency = new FormControl();
    this.trmlFrequencyRange = new FormControl();
    this.trmlStartDate = new FormControl();
    this.trmlEndDate = new FormControl();
    this.trmlEndTime = new FormControl();
    this.trmlStartTime = new FormControl();
    this.posKey = new FormControl();
    this.posStartDate = new FormControl();
    this.posEndDate = new FormControl();

    this.createForm = this.fb.group({
      terminalCode: this.terminalCode,
      trmlSrvType: this.trmlSrvType,
      locationId: this.locationId,
      terminalIp: this.terminalIp,
      trmlWindowNumber: this.trmlWindowNumber,
      trmlSrvNumber: this.trmlSrvNumver,
      adminId: this.adminId,
      commissionDate: this.commissionDate,
      appId: this.appId,
      terminalFeature: this.terminalFeature,
      trmlFeatValue: this.trmlFeatValue,
      trmlFromDate: this.trmlFromDate,
      trmlToDate: this.trmlToDate,
      trmlFrequency: this.trmlFrequency,
      trmlFrequencyRange: this.trmlFrequencyRange,
      trmlStartDate: this.trmlStartDate,
      trmlEndDate: this.trmlEndDate,
      trmlStartTime: this.trmlStartTime,
      trmlEndTime: this.trmlEndTime,
      posKey: this.posKey,
      posStartDate: this.posStartDate,
      posEndDate: this.posEndDate,
    })

    this.t_timings.push(this.t_timings.length);
    this.p_details.push(this.p_details.length);
    // this.t_char1.push(this.t_char1.length);
    // this.t_char2.push(this.t_char2.length);
  }

  resetForm(){
    alert("Are you sure to reset this page?")
    this.createForm.reset();
  }

  
 CreateForm(){
    this.newTerminal = new Terminal();
    this.newTerminalChar = new Terminalchar();
    this.newTerminalTime = new Terminaltimings();
    this.newPosTrmlDetails = new Postrmldetails();
    this.newTerminal.terminalId = 356;
    this.newTerminal.terminalCode = this.terminalCode.value;
    this.newTerminal.trmlSrvType = this.trmlSrvType.value;
    this.newTerminal.locationId = this.locationId.value;
    this.newTerminal.terminalIp = this.terminalIp.value;
    this.newTerminal.windowNumber = this.trmlWindowNumber.value;
    this.newTerminal.trmlSrvNumber = this.trmlSrvNumver.value;
    this.newTerminal.adminId = this.adminId.value;
    this.newTerminal.commissionDate = this.commissionDate.value;
    this.newTerminal.validStatus = 1;
    this.newTerminal.updatedBy = 'cris_hyd';
    this.newTerminal.updatedOn = new Date();
    this.commonService.createTerminal(this.newTerminal).subscribe((terminal: Terminal) => 
    {
      this.terminal = terminal;
      console.log(this.terminal);
    });
    this.newTerminalChar.terminalParameterUid = 6;
    this.newTerminalChar.terminalId = 356;
    this.newTerminalChar.appId = this.appId.value;
    this.newTerminalChar.locationId = this.locationId.value;
    this.newTerminalChar.validStatus = 1;
    this.newTerminalChar.validFrom = this.trmlFromDate.value;
    this.newTerminalChar.validUpto = this.trmlToDate.value;
    this.newTerminalChar.updatedBy = 'cris_hyd';
    this.newTerminalChar.updatedOn = new Date();
    this.commonService.createTerminalParam(this.newTerminalChar).subscribe((terminalchar: Terminalchar) => 
    {
      this.terminalchar = terminalchar;
      console.log(this.terminalchar);
    });
    this.newTerminalTime.terminalId = 356;
    this.newTerminalTime.appId = this.appId.value;
    this.newTerminalTime.usageFrequencyType = this.trmlFrequency.value;
    this.newTerminalTime.usageFrequencyValue = this.trmlFrequencyRange.value;
    this.newTerminalTime.startDate = this.trmlStartDate.value;
    this.newTerminalTime.endDate = this.trmlEndDate.value;
    this.newTerminalTime.startTime = this.trmlStartTime.value;
    this.newTerminalTime.endTime = this.trmlEndTime.value;
    this.commonService.createTerminalTime(this.newTerminalTime).subscribe((terminaltime: Terminaltimings) => 
    {
      this.terminaltime = terminaltime;
      console.log(this.terminaltime);
    });
    this.newPosTrmlDetails.posKey = 559;
    this.newPosTrmlDetails.terminalTypeId = 1;
    this.newPosTrmlDetails.terminalId = 356;
    this.newPosTrmlDetails.locationId = this.locationId.value;
    this.newPosTrmlDetails.validFrom = this.posStartDate.value;
    this.newPosTrmlDetails.validUpto = this.posEndDate.value;
    this.newPosTrmlDetails.validStatus = 1;
    this.newPosTrmlDetails.updatedBy = 'cris_hyd';
    this.newPosTrmlDetails.updatedOn = new Date();
    this.commonService.createPosTrmlDetails(this.newPosTrmlDetails).subscribe((postrmldetails: Postrmldetails) => 
    {
      this.postrmldetails = postrmldetails;
      console.log(this.postrmldetails);
    });
  }

  ngOnInit() {
    

  }

  servers: Server[] = [
    {value: '1', viewValue: 'TCP/IP'},
    {value: '2', viewValue: 'ThinClient'},
    {value: '3', viewValue: 'DEC'}
  ];

  apps: App[] = [
    {value: 1, viewValue: 'UTS'},
    {value: 2, viewValue: 'PRS'},
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
    {value: 1, viewValue: 'SC - Secunderabad'},
    {value: 2, viewValue: 'TPTY - Tirupaty'},
    {value: 3, viewValue: 'RU - Renigunta'}
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
    {value: 'M', viewValue: 'Monday'},
    {value: 'T', viewValue: 'Tuesday'},
    {value: 'W', viewValue: 'Wednesday'},
    {value: 'T', viewValue: 'Thursday'},
    {value: 'F', viewValue: 'Friday'},
    {value: 'S', viewValue: 'Saturday'},
    {value: 'S', viewValue: 'Sunday'},
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


