
package es.caib.digitalib.model.fields;
import org.fundaciobit.genapp.common.query.*;
public interface UsuariPersonaFields extends java.io.Serializable {

  public static final String _TABLE_SQL = "dib_usuaripersona";


  public static final String _TABLE_MODEL = "usuariPersona";


  public static final String _TABLE_TRANSLATION = _TABLE_MODEL + "." + _TABLE_MODEL;


	 public static final LongField USUARIPERSONAID = new LongField(_TABLE_MODEL, "usuariPersonaID", "usuaripersonaid");  // PK
	 public static final StringField USERNAME = new StringField(_TABLE_MODEL, "username", "username");
	 public static final StringField NOM = new StringField(_TABLE_MODEL, "nom", "nom");
	 public static final StringField LLINATGES = new StringField(_TABLE_MODEL, "llinatges", "llinatges");
	 public static final StringField EMAIL = new StringField(_TABLE_MODEL, "email", "email");
	 public static final StringField NIF = new StringField(_TABLE_MODEL, "nif", "nif");
	 public static final StringField IDIOMAID = new StringField(_TABLE_MODEL, "idiomaID", "idiomaid");
	 public static final LongField CONFIGURACIOGRUPID = new LongField(_TABLE_MODEL, "configuraciogrupid", "configuraciogrupid");


  public static final Field<?>[] ALL_USUARIPERSONA_FIELDS = {
    USUARIPERSONAID,
    USERNAME,
    NOM,
    LLINATGES,
    EMAIL,
    NIF,
    IDIOMAID,
    CONFIGURACIOGRUPID
  };


  public static final Field<?>[] PRIMARYKEY_FIELDS = {
USUARIPERSONAID
  };
}
