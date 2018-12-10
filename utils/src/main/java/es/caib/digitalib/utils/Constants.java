package es.caib.digitalib.utils;


/**
 *
 * @author anadal
 *
 */
public interface Constants {

	public static final String DIGITALIB_PROPERTY_BASE = "es.caib.digitalib.";

	public static final String SECURITY_DOMAIN = "seycon";

	public static final String MAIL_SERVICE = "java:/es.caib.digitalib.mail";

	public static final String MAIL_QUEUE = "jms/DigitalIBMailsQueue";

	public static final String DIB_ADMIN = "DIB_ADMIN";

	public static final String DIB_USER = "DIB_USER";

	// ROLE ADMIN 
	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	// ROLE USER
	public static final String ROLE_USER = "ROLE_USER"; 
	
	// ROLE SCAN
  public static final String ROLE_SCAN = "ROLE_SCAN";
  // ROLE COAU
  public static final String ROLE_COAU = "ROLE_COAU";
  //ROLE CUST
  public static final String ROLE_CUST = "ROLE_CUST";



	public static final int TIPUS_PLUGIN_SCANWEB = 0;

	public static final int TIPUS_PLUGIN_FIRMA_EN_SERVIDOR = 1;

	public static final int TIPUS_PLUGIN_DOCUMENT_CUSTODY = 2;

	public static final int TIPUS_PLUGIN_ARXIU = 3;

	
	public static final int TIPUS_CUSTODIA_ARXIU = 0;
	public static final int TIPUS_CUSTODIA_DOCUMENTCUSTODY = 1;
	
	public static final int[] TIPUS_CUSTODIA = {
			TIPUS_CUSTODIA_ARXIU,
			TIPUS_CUSTODIA_DOCUMENTCUSTODY
	};

	public static final int TIPUS_FIRMA_EN_SERVIDOR_PLUGIN = 0;
	public static final int TIPUS_FIRMA_EN_SERVIDOR_APISIMPLE = 1;

	public static final int[] TIPUS_FIRMA_EN_SERVIDOR = {
			TIPUS_FIRMA_EN_SERVIDOR_PLUGIN,
			TIPUS_FIRMA_EN_SERVIDOR_APISIMPLE
	};


	public static final int FORMAT_FILE_PDF = 0; // "pdf";

	public static final int FORMAT_FILE_JPG = 1; // "jpg";

	public static final int FORMAT_FILE_TIFF = 2; // "tif";

	public static final int FORMAT_FILE_PNG = 3; // "png";

	public static final int FORMAT_FILE_GIF = 4; // "gif";


	// 15 minuts
	public static final long EXPIRATION_TIME_MS = 900000L;



//	public static final int PERFIL_US_PLANTILLA = 0; 
//
//	public static final int PERFIL_US_TRANSACCIO_INFO = 1;


	public static final int PIXEL_TYPE_BLACK_WHITE = 0;

	public static final int PIXEL_TYPE_GRAY = 1;

	public static final int PIXEL_TYPE_COLOR = 2;

	public static final int[] PIXEL_TYPE = {
			PIXEL_TYPE_BLACK_WHITE,
			PIXEL_TYPE_GRAY,
			PIXEL_TYPE_COLOR
	};
	
	
	//public static final int PERFIL_US_TRANSACCIO_INFO = 0;
	
	
	public static final int PERFIL_US_ALL_INFO = 0;
	
	 public static final int PERFIL_US_NOMES_ESCANEIG_INFO = -1;
	  public static final int PERFIL_US_COPIA_AUTENTICA_INFO = -2;
	  public static final int PERFIL_US_CUSTODIA_INFO = -3;
	
	  
	
	public static final int PERFIL_US_NOMES_ESCANEIG = 1;
	public static final int PERFIL_US_COPIA_AUTENTICA = 2;
	public static final int PERFIL_US_CUSTODIA = 3;
	
	public static final int[] PERFIL_US = {
	     PERFIL_US_NOMES_ESCANEIG_INFO,
       PERFIL_US_COPIA_AUTENTICA_INFO,
       PERFIL_US_CUSTODIA_INFO,
       
			PERFIL_US_NOMES_ESCANEIG,
			PERFIL_US_COPIA_AUTENTICA,
			PERFIL_US_CUSTODIA
	};
}
