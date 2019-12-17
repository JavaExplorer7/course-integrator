package course.web.api;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorConversion {
  
  public static final Map<String, String> DEPARTMENTS = 
      Stream.of(new String[][] {
        {"Arts and Humanities", "AU"},
        {"Social Science", "SS"},
        {"Commonsense", "C"},
        {"Sciences", "S"},
        {"Engineering", "E"},
        {"Built Environment", "BE"},
        {"Information Science", "IS"}})
    .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> DEPT_AU = 
      Stream.of(new String[][] {
          {"Foreign Languages and Cultures", "FL"},
          {"Arts", "AT"},
          {"Physical Education", "PE"},
          {"Meishi Film Academy", "FA"},
          {"Liberal Arts College", "LA"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_FL = 
      Stream.of(new String[][] {
          {"English", "ENG"},
          {"German", "GER"},
          {"Japanese", "JAP"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_AT = 
      Stream.of(new String[][] {
          {"Music Performing", "MP"},
          {"Dancing", "DA"},
          {"Painting", "PA"},
          {"Animation", "ANIM"},
          {"Visual Communication Design", "VCD"},
          {"Environment Design", "ED"},
          {"Industrial Design", "ID"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_PE = 
      Stream.of(new String[][] {
          {"Sports Education", "PESS"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_FA = 
      Stream.of(new String[][] {
          {"Theater, Film & TV Literature", "TFTL"},
          {"Broadcasting & Television Composing and Directing", "BTCD"},
          {"Directing", "DIR"},
          {"Theater, Film & TV Art Design", "TFTD"},
          {"Broadcasting & Hosting Art", "BHA"},
          {"Photography", "PHOT"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_LA = 
      Stream.of(new String[][] {
          {"Chinese Language & Literature", "CLL"},
          {"Philosophy", "PHIL"},
          {"Historiography", "HIST"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  

  private static final Map<String, String> DEPT_SS = 
      Stream.of(new String[][] {
          {"Public Affairs", "PA"},
          {"Economics and Business Administration", "EBA"},
          {"Journalism and Communication", "JC"},
          {"Law School", "LAW"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_PA = 
      Stream.of(new String[][] {
          {"Public Administration", "PA"},
          {"Urban Management", "UM"},
          {"International Economy and Trade", "IET"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_EBA = 
      Stream.of(new String[][] {
          {"Finance", "FIAN"},
          {"Information Management and Information Systems", "IMIS"},
          {"Business Administration", "BA"},
          {"Marketing", "MARK"},
          {"Accounting", "ACC"},
          {"Logistic Management", "LM"},
          {"E-Commerce", "EC"},
          {"Energy Economics", "EE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_JC = 
      Stream.of(new String[][] {
          {"Journalism", "JOUR"},
          {"Broadcasting & Television Journalism", "BTJ"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_LAW = 
      Stream.of(new String[][] {
          {"Law", "LAW"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  
  private static final Map<String, String> DEPT_S = 
      Stream.of(new String[][] {
          {"Mathematics and Statistics", "MATH"},
          {"Physics", "PHY"},
          {"Chemistry and Chemical Engineering", "CCE"},
          {"Bioengineering College", "BIO"},
          {"Life Science ", "LS"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_MATH = 
      Stream.of(new String[][] {
          {"Mathematics and Applied Mathematics", "MAM"},
          {"Information and Computing Science", "ICS"},
          {"Statistics", "STAT"},
          {"Financial Mathematics", "FM"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_PHY = 
      Stream.of(new String[][] {
          {"Physics", "PHYS"},
          {"Applied Physics", "APHY"},
          {"Electronic Information Science and Technology", "EICT"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_CCE = 
      Stream.of(new String[][] {
          {"Applied Chemistry", "ACHEM"},
          {"Material Chemistry", "MCHEM"},
          {"Chemical Engineering & Technology", "CET"},
          {"Pharmaceutical Engineering", "PHE"},
          {"Pharmacy", "PH"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_BIO = 
      Stream.of(new String[][] {
          {"Biomedical Engineering", "BIO"},
          {"Bioengineering", "BIO"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_LS = 
      Stream.of(new String[][] {
          {"Biological Science", "LS"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  
  private static final Map<String, String> DEPT_E = 
      Stream.of(new String[][] {
          {"Electrical Engineering", "EE"},
          {"Mechanical Engineering", "ME"},
          {"Power Engineering", "POWE"},
          {"Resources and Environmental Science", "RES"},
          {"Materials Science and Engineering", "MSE"},
          {"Aerospace Engineering", "AERO"},
          {"Automotive Engineering", "AE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_EE= 
      Stream.of(new String[][] {
          {"Electrical Engineering & Its Automation", "EE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_ME = 
      Stream.of(new String[][] {
          {"Mechanical Design, Manufacturing and Automation", "MDMA"},
          {"Mechanical & Electronic Engineering", "MEE"},
          {"Industrial Engineering", "IE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_POWE = 
      Stream.of(new String[][] {
          {"Thermal and Power Engineering", "POWER"},
          {"New Energy Science and Engineering", "POWER"},
          {"Nuclear Engineering & Nuclear Technology", "POWER"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_RES = 
      Stream.of(new String[][] {
          {"Mining Engineering", "ME"},
          {"Environmental Science", "ES"},
          {"Safety Engineering", "SAFE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_MSE = 
      Stream.of(new String[][] {
          {"Material Forming and Control Engineering", "MFCE"},
          {"Material Science & Engineering", "MSE"},
          {"Metallurgical Engineering", "METAL"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_AERO = 
      Stream.of(new String[][] {
          {"Engineering Mechanics", "AERO"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_AE = 
      Stream.of(new String[][] {
          {"Vehicle Engineering", "VE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  
  private static final Map<String, String> DEPT_BE = 
      Stream.of(new String[][] {
          {"Architecture and Urban Planning", "AUP"},
          {"Civil Engineering", "CIVI"},
          {"Urban Construction and Environmental Engineering", "UCEE"},
          {"Construction Management and Real Estate", "CMRE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));  

  private static final Map<String, String> SCHOOL_AUP = 
      Stream.of(new String[][] {
          {"Architecture", "ARCH"},
          {"Urban Planning", "UP"},
          {"Landscape Architecture", "LA"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_CIVI = 
      Stream.of(new String[][] {
          {"Civil Engineering", "CIVI"},
          {"Survey Engineering", "SURV"},
          {"Exploration Technology & Engineering", "ETE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_UCEE = 
      Stream.of(new String[][] {
          {"Building Environment and Facility Engineering", "BEFE"},
          {"Water Supply and Drainage Engineering", "WSDE"},
          {"Environmental Engineering", "ENVE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_CMRE = 
      Stream.of(new String[][] {
          {"Project Management", "PROJ"},
          {"Real Estate Management", "REM"},
          {"Project Costing", "PROC"},
          {"Financial Management", "FINM"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  
  private static final Map<String, String> DEPT_IS = 
      Stream.of(new String[][] {
          {"Computer Science", "CST"},
          {"Big Data and Software Engineering", "SE"},
          {"OptoElectronic Engineering", "OE"},
          {"Communication Engineering", "CE"},
          {"Automation", "AUTO"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_CST = 
      Stream.of(new String[][] {
          {"Computer Science and Technology", "CST"},
          {"Information Security", "IS"},
          {"Networking Engineering", "NE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));  
  
  private static final Map<String, String> SCHOOL_SE = 
      Stream.of(new String[][] {
          {"Software Engineering", "SE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_OE = 
      Stream.of(new String[][] {
          {"Testing & Monitoring Technology & Apparatus", "TMTA"},
          {"Electronic Science and Technology", "EST"},
          {"Optical & Electronic Information Engineering", "OEIE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));

  private static final Map<String, String> SCHOOL_CE = 
      Stream.of(new String[][] {
          {"Electronic Information Engineering", "EIE"},
          {"Telecommunication Engineering", "TE"},
          {"Integrated Circuit Design & Integrated System", "ICDI"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  private static final Map<String, String> SCHOOL_AUTO = 
      Stream.of(new String[][] {
          {"Automation", "AUTO"},
          {"Logistic Engineering", "LE"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  // Common Sense department doesn't have majors 
  private static final Map<String, String> DEPT_C = 
      Stream.of(new String[][] {
          {"Innovative Practice", "IPG"},
          {"Scientific Technology", "STG"},
          {"Social Science", "SSG"},
          {"Humanity", "HG"}})
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
  
  public static Map<String, String> getSchools(String dept) {
    switch (dept) {
    
      case "AU":   return DEPT_AU;
      case "SS":   return DEPT_SS;
      case "C" :   return DEPT_C;
      case "S" :   return DEPT_S;
      case "E" :   return DEPT_E;
      case "BE":   return DEPT_BE;
      case "IS":   return DEPT_IS;
      
      default  : return null;
    }
  }
  
  public static Map<String, String> getMajors(String school) {
    switch (school) {
    
      case "FA"   :  return SCHOOL_FA;
      case "FL"   :  return SCHOOL_FL;
      case "LA"   :  return SCHOOL_LA;
      case "PE"   :  return SCHOOL_PE;
      case "AT"   :  return SCHOOL_AT;
      case "LAW"  :  return SCHOOL_LAW;
      case "JC"   :  return SCHOOL_JC;
      case "EBA"  :  return SCHOOL_EBA;
      case "PA"   :  return SCHOOL_PA;
      case "LS"   :  return SCHOOL_LS;
      case "BIO"  :  return SCHOOL_BIO;
      case "CCE"  :  return SCHOOL_CCE;
      case "MATH" :  return SCHOOL_MATH;
      case "PHY"  :  return SCHOOL_PHY;
      case "RES"  :  return SCHOOL_RES;
      case "MSE"  :  return SCHOOL_MSE;
      case "AE"   :  return SCHOOL_AE;
      case "AERO" :  return SCHOOL_AERO;
      case "POWE" :  return SCHOOL_POWE;
      case "ME"   :  return SCHOOL_ME;
      case "EE"   :  return SCHOOL_EE;
      case "AUP"  :  return SCHOOL_AUP;
      case "CMRE" :  return SCHOOL_CMRE;
      case "CIVI" :  return SCHOOL_CIVI;
      case "UCEE" :  return SCHOOL_UCEE;
      case "AUTO" :  return SCHOOL_AUTO;
      case "OE"   :  return SCHOOL_OE;
      case "CST"  :  return SCHOOL_CST;
      case "CE"   :  return SCHOOL_CE;
      case "SE"   :  return SCHOOL_SE;

      default  : return null;
    }
  }

}
