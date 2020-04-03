export class Terminaldata {
    //Terminal
    terminalId: Number;
    terminalCode: String;
    locationId: Number;
    trmlSrvNumber: Number;
    windowNumber: Number;
    validStatus : Number;
    adminId: String;
    terminalIp: String;
    trmlSrvType: String;
    commissionDate: Date;   
    updatedBy : String;
    updatedOn : Date;
        
    //Pos Details
    posKey: Number;	
    mid: String;
    posTid: String;
    posMac:String;	
	posMake: String;	
    posBankCode: String;
    validUpto: Date;
    validFrom: Date;

     //Pos Terminal Details
     posTrmlUid: Number;	
     terminalTypeId: Number;
    
    //Terminal Timeing
    terminalTimingUid: Number; 
    usageFrequencyType: String ;
    usageFrequencyValue: String;
    startDate: Date;
    endDate:Date;
    startTime: Date;
    endTime: Date;
    

    //Terminal app location Parameter
    terminalParameterUid: Number;
    appId: Number;
    name: String;
	value: String;
    description: String ;
    serialNumber: Number ;
    trmlAppLocParamUid: Number ;
   
    // Master Terminal Parameter
    
    paramType:String;
	
	
   
    //private Integer terminalId;
	//private Integer appId;
	//private Integer terminalId;
    //validStatus: Boolean ;
    //locationId: Number;
	//private Integer locationId;
	//private Integer validStatus;
	//private Date validFrom;
    //private Date validUpto;
	//private String updatedBy;
	//private Date updatedOn;
	//pos details;
	//private Integer posKey; 				
    //private Integer validStatus;	
    //private LocalDate startDate;
    //private LocalDate endDate;
    //private LocalTime startTime;
    //private LocalTime endTime;
    //pos trml details	
    //FEATURE_VALUE: String;
    //VALID_FROM: Date;
    //VALID_UPTO: Date;
    //private Integer terminalId;	
	//private String terminalCode;
	//private Integer locationId;
	//private Integer trmlSrvNumber;
	//private Integer windowNumber;		
	//private Integer validStatus;
	//private String adminId;
	//private String terminalIp;
	//private String trmlSrvType;
	//private String updatedBy;
    //private Date commissionDate;
	//private Date updatedOn;
    //terminal parameter
    //updatedBy: String ;
    //updatedOn: Date;	
	//private Integer terminalId;
	//private Integer appId;
	//private String name;
	//private String value;
	//private String description;
	//private Integer validStatus;
    //private Date validUpto;
    //private Date validFrom;
	//private Integer locationId;
	//private Integer serialNumber;
	//private String updatedBy;
	//private Date updatedOn;
	//private Integer parameterId;
	//terminal timing
}
