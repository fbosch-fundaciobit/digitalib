package es.caib.digitalib.jpa.validator;

import org.apache.log4j.Logger;

import org.fundaciobit.genapp.common.query.Field;
import es.caib.digitalib.model.fields.UsuariPersonaFields;
import es.caib.digitalib.model.fields.ConfiguracioGrupFields;
import es.caib.digitalib.model.fields.IdiomaFields;

import org.fundaciobit.genapp.common.validation.IValidatorResult;


/**
 *  ========= FITXER AUTOGENERAT - NO MODIFICAR !!!!! 
 * @author GenApp
 * @author anadal
 */
public class UsuariPersonaValidator<T> implements UsuariPersonaFields {

  protected final Logger log = Logger.getLogger(getClass());


  public UsuariPersonaValidator() {
    super();    
  }
  

  /** Constructor */
  public void validate(IValidatorResult<T> __vr, T __target__, boolean __isNou__
    ,es.caib.digitalib.model.dao.IConfiguracioGrupManager __configuracioGrupManager
    ,es.caib.digitalib.model.dao.IIdiomaManager __idiomaManager
    ,es.caib.digitalib.model.dao.IUsuariPersonaManager __usuariPersonaManager) {

    // Valors Not Null
    __vr.rejectIfEmptyOrWhitespace(__target__,USERNAME, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(USERNAME)));

    __vr.rejectIfEmptyOrWhitespace(__target__,NOM, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NOM)));

    __vr.rejectIfEmptyOrWhitespace(__target__,LLINATGES, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(LLINATGES)));

    __vr.rejectIfEmptyOrWhitespace(__target__,EMAIL, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(EMAIL)));

    __vr.rejectIfEmptyOrWhitespace(__target__,NIF, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NIF)));

    __vr.rejectIfEmptyOrWhitespace(__target__,IDIOMAID, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(IDIOMAID)));

    __vr.rejectIfEmptyOrWhitespace(__target__,CONFIGURACIOGRUPID, 
        "genapp.validation.required",
        new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(CONFIGURACIOGRUPID)));

    // Check size
    if (__vr.getFieldErrorCount(USERNAME) == 0) {
      java.lang.String __username = (java.lang.String)__vr.getFieldValue(__target__,USERNAME);
      if (__username!= null && __username.length() > 50) {
        __vr.rejectValue(USERNAME, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(USERNAME)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(50)));
      }
    }
    
    if (__vr.getFieldErrorCount(NOM) == 0) {
      java.lang.String __nom = (java.lang.String)__vr.getFieldValue(__target__,NOM);
      if (__nom!= null && __nom.length() > 50) {
        __vr.rejectValue(NOM, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NOM)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(50)));
      }
    }
    
    if (__vr.getFieldErrorCount(LLINATGES) == 0) {
      java.lang.String __llinatges = (java.lang.String)__vr.getFieldValue(__target__,LLINATGES);
      if (__llinatges!= null && __llinatges.length() > 100) {
        __vr.rejectValue(LLINATGES, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(LLINATGES)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(100)));
      }
    }
    
    if (__vr.getFieldErrorCount(EMAIL) == 0) {
      java.lang.String __email = (java.lang.String)__vr.getFieldValue(__target__,EMAIL);
      if (__email!= null && __email.length() > 100) {
        __vr.rejectValue(EMAIL, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(EMAIL)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(100)));
      }
    }
    
    if (__vr.getFieldErrorCount(EMAIL) == 0) {
      String val = String.valueOf(__vr.getFieldValue(__target__,EMAIL));
      if (val != null && val.trim().length() != 0) {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        if (!p.matcher(val).matches()) {
          __vr.rejectValue(EMAIL, "genapp.validation.malformed",
             new org.fundaciobit.genapp.common.i18n.I18NArgumentString(val), new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(EMAIL)));
        }
      }
    }

    if (__vr.getFieldErrorCount(NIF) == 0) {
      java.lang.String __nif = (java.lang.String)__vr.getFieldValue(__target__,NIF);
      if (__nif!= null && __nif.length() > 9) {
        __vr.rejectValue(NIF, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NIF)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(9)));
      }
    }
    
    if (__vr.getFieldErrorCount(NIF) == 0) {
      String val = String.valueOf(__vr.getFieldValue(__target__,NIF));
      if (val != null && val.trim().length() != 0) {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("([XYZ][0-9]{7}[A-Z])|([0-9]{8}[A-Z])");
        if (!p.matcher(val).matches()) {
          __vr.rejectValue(NIF, "genapp.validation.malformed",
             new org.fundaciobit.genapp.common.i18n.I18NArgumentString(val), new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NIF)));
        }
      }
    }

    if (__vr.getFieldErrorCount(IDIOMAID) == 0) {
      java.lang.String __idiomaid = (java.lang.String)__vr.getFieldValue(__target__,IDIOMAID);
      if (__idiomaid!= null && __idiomaid.length() > 5) {
        __vr.rejectValue(IDIOMAID, "genapp.validation.sizeexceeds",
            new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(IDIOMAID)), new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(5)));
      }
    }
    
    if (__isNou__) { // Creació
      // ================ CREATION
      // Fitxers 
      // ====== Check Unique MULTIPLES - NOU =======

      // Check Unique - no PK
      if (__vr.getFieldErrorCount(USERNAME) == 0) {
        java.lang.String __username = (java.lang.String)__vr.getFieldValue(__target__,USERNAME);
        Long __count_ = null;
        try { __count_ = __usuariPersonaManager.count(org.fundaciobit.genapp.common.query.Where.AND(USERNAME.equal(__username))); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
        if (__count_ == null || __count_ != 0) {        
            __vr.rejectValue(USERNAME, "genapp.validation.unique",
                new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__username)),
                     new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(USERNAME)));
        }
      }

      if (__vr.getFieldErrorCount(NIF) == 0) {
        java.lang.String __nif = (java.lang.String)__vr.getFieldValue(__target__,NIF);
        Long __count_ = null;
        try { __count_ = __usuariPersonaManager.count(org.fundaciobit.genapp.common.query.Where.AND(NIF.equal(__nif))); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
        if (__count_ == null || __count_ != 0) {        
            __vr.rejectValue(NIF, "genapp.validation.unique",
                new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__nif)),
                     new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NIF)));
        }
      }

      // Check Unique - PK no AutoIncrement amb UNA SOLA PK 
    } else {
      // ================ UPDATE

      // ====== Check Unique MULTIPLES - EDIT  =======

      // Check Unique - no PK
      if (__vr.getFieldErrorCount(USERNAME) == 0 && __vr.getFieldErrorCount(USUARIPERSONAID) == 0) {
        java.lang.String __username = (java.lang.String)__vr.getFieldValue(__target__,USERNAME);
        java.lang.Long __usuaripersonaid = (java.lang.Long)__vr.getFieldValue(__target__,USUARIPERSONAID);
        Long __count_ = null;
        try { __count_ = __usuariPersonaManager.count(org.fundaciobit.genapp.common.query.Where.AND(USERNAME.equal(__username), USUARIPERSONAID.notEqual(__usuaripersonaid))); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
        if (__count_ == null || __count_ != 0) {        
            __vr.rejectValue(USERNAME, "genapp.validation.unique",
                new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__username)),
                     new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(USERNAME)));
        }
      }

      if (__vr.getFieldErrorCount(NIF) == 0 && __vr.getFieldErrorCount(USUARIPERSONAID) == 0) {
        java.lang.String __nif = (java.lang.String)__vr.getFieldValue(__target__,NIF);
        java.lang.Long __usuaripersonaid = (java.lang.Long)__vr.getFieldValue(__target__,USUARIPERSONAID);
        Long __count_ = null;
        try { __count_ = __usuariPersonaManager.count(org.fundaciobit.genapp.common.query.Where.AND(NIF.equal(__nif), USUARIPERSONAID.notEqual(__usuaripersonaid))); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
        if (__count_ == null || __count_ != 0) {        
            __vr.rejectValue(NIF, "genapp.validation.unique",
                new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__nif)),
                     new org.fundaciobit.genapp.common.i18n.I18NArgumentCode(get(NIF)));
        }
      }

    }

    // Fields with References to Other tables 
    if (__vr.getFieldErrorCount(IDIOMAID) == 0) {
      java.lang.String __idiomaid = (java.lang.String)__vr.getFieldValue(__target__,IDIOMAID);
      Long __count_ = null;
      try { __count_ = __idiomaManager.count(IdiomaFields.IDIOMAID.equal(__idiomaid)); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
      if (__count_ == null || __count_ == 0) {        
        __vr.rejectValue(IDIOMAID, "error.notfound",
         new org.fundaciobit.genapp.common.i18n.I18NArgumentCode("idioma.idioma"),
         new org.fundaciobit.genapp.common.i18n.I18NArgumentCode("idioma.idiomaID"),
         new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__idiomaid)));
      }
    }

    if (__vr.getFieldErrorCount(CONFIGURACIOGRUPID) == 0) {
      java.lang.Long __configuraciogrupid = (java.lang.Long)__vr.getFieldValue(__target__,CONFIGURACIOGRUPID);
      Long __count_ = null;
      try { __count_ = __configuracioGrupManager.count(ConfiguracioGrupFields.CONFIGURACIOGRUPID.equal(__configuraciogrupid)); } catch(org.fundaciobit.genapp.common.i18n.I18NException e) { e.printStackTrace(); };
      if (__count_ == null || __count_ == 0) {        
        __vr.rejectValue(CONFIGURACIOGRUPID, "error.notfound",
         new org.fundaciobit.genapp.common.i18n.I18NArgumentCode("configuracioGrup.configuracioGrup"),
         new org.fundaciobit.genapp.common.i18n.I18NArgumentCode("configuracioGrup.configuracioGrupID"),
         new org.fundaciobit.genapp.common.i18n.I18NArgumentString(String.valueOf(__configuraciogrupid)));
      }
    }

  } // Final de mètode
  public String get(Field<?> field) {
    return field.fullName;
  }
  
}