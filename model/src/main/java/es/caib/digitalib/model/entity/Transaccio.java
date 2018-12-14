package es.caib.digitalib.model.entity;

public interface Transaccio extends org.fundaciobit.genapp.common.IGenAppEntity {

	public long getTransaccioID();
	public void setTransaccioID(long _transaccioID_);

	public java.lang.String getTransactionWebId();
	public void setTransactionWebId(java.lang.String _transactionWebId_);

	public java.sql.Timestamp getDataInici();
	public void setDataInici(java.sql.Timestamp _dataInici_);

	public java.sql.Timestamp getDataFi();
	public void setDataFi(java.sql.Timestamp _dataFi_);

	public java.lang.Long getUsuariAplicacioId();
	public void setUsuariAplicacioId(java.lang.Long _usuariAplicacioId_);

	public java.lang.Long getUsuariPersonaId();
	public void setUsuariPersonaId(java.lang.Long _usuariPersonaId_);

	public java.lang.String getIp();
	public void setIp(java.lang.String _ip_);

	public java.lang.String getReturnUrl();
	public void setReturnUrl(java.lang.String _returnUrl_);

	public int getEstatCodi();
	public void setEstatCodi(int _estatCodi_);

	public java.lang.String getEstatMissatge();
	public void setEstatMissatge(java.lang.String _estatMissatge_);

	public java.lang.String getEstatExcepcio();
	public void setEstatExcepcio(java.lang.String _estatExcepcio_);

	public java.lang.Long getFitxerEscanejatID();
	public void setFitxerEscanejatID(java.lang.Long _fitxerEscanejatID_);

	public java.lang.String getHashEscaneig();
	public void setHashEscaneig(java.lang.String _hashEscaneig_);

	public java.lang.Long getFitxerSignaturaID();
	public void setFitxerSignaturaID(java.lang.Long _fitxerSignaturaID_);

	public java.lang.String getHashFirma();
	public void setHashFirma(java.lang.String _hashFirma_);

	public java.lang.Integer getInfoScanPixelType();
	public void setInfoScanPixelType(java.lang.Integer _infoScanPixelType_);

	public java.lang.Integer getInfoScanResolucioPpp();
	public void setInfoScanResolucioPpp(java.lang.Integer _infoScanResolucioPpp_);

	public boolean isInfoScanOcr();
	public void setInfoScanOcr(boolean _infoScanOcr_);

	public java.lang.Integer getView();
	public void setView(java.lang.Integer _view_);

	public java.lang.String getLanguageUI();
	public void setLanguageUI(java.lang.String _languageUI_);

	public java.lang.String getFuncionariUsername();
	public void setFuncionariUsername(java.lang.String _funcionariUsername_);

	public java.lang.String getSignParamFuncionariNom();
	public void setSignParamFuncionariNom(java.lang.String _signParamFuncionariNom_);

	public java.lang.String getSignParamFuncionariNif();
	public void setSignParamFuncionariNif(java.lang.String _signParamFuncionariNif_);

	public java.lang.String getSignParamLanguageDoc();
	public void setSignParamLanguageDoc(java.lang.String _signParamLanguageDoc_);

	public java.lang.String getArxiuReqParamDocEstatElabora();
	public void setArxiuReqParamDocEstatElabora(java.lang.String _arxiuReqParamDocEstatElabora_);

	public java.lang.String getArxiuReqParamDocumentTipus();
	public void setArxiuReqParamDocumentTipus(java.lang.String _arxiuReqParamDocumentTipus_);

	public java.lang.Integer getArxiuReqParamOrigen();
	public void setArxiuReqParamOrigen(java.lang.Integer _arxiuReqParamOrigen_);

	public java.lang.String getArxiuReqParamInteressats();
	public void setArxiuReqParamInteressats(java.lang.String _arxiuReqParamInteressats_);

	public java.lang.String getArxiuReqParamCiutadaNif();
	public void setArxiuReqParamCiutadaNif(java.lang.String _arxiuReqParamCiutadaNif_);

	public java.lang.String getArxiuReqParamCiutadaNom();
	public void setArxiuReqParamCiutadaNom(java.lang.String _arxiuReqParamCiutadaNom_);

	public java.lang.String getArxiuOptParamProcedimentCodi();
	public void setArxiuOptParamProcedimentCodi(java.lang.String _arxiuOptParamProcedimentCodi_);

	public java.lang.String getArxiuOptParamProcedimentNom();
	public void setArxiuOptParamProcedimentNom(java.lang.String _arxiuOptParamProcedimentNom_);

	public java.lang.String getArxiuOptParamOrgans();
	public void setArxiuOptParamOrgans(java.lang.String _arxiuOptParamOrgans_);

	public java.lang.String getArxiuOptParamSerieDocumental();
	public void setArxiuOptParamSerieDocumental(java.lang.String _arxiuOptParamSerieDocumental_);

	public java.lang.String getArxiuOptParamCustodyOrExpedientId();
	public void setArxiuOptParamCustodyOrExpedientId(java.lang.String _arxiuOptParamCustodyOrExpedientId_);

	public long getPerfilID();
	public void setPerfilID(long _perfilID_);

	public java.lang.Long getInfoSignaturaID();
	public void setInfoSignaturaID(java.lang.Long _infoSignaturaID_);

	public java.lang.Long getInfoCustodyID();
	public void setInfoCustodyID(java.lang.Long _infoCustodyID_);

  // Fitxer
  public <F extends Fitxer> F getFitxerEscanejat();
  // Fitxer
  public <F extends Fitxer> F getFitxerSignatura();


  // ======================================

}
