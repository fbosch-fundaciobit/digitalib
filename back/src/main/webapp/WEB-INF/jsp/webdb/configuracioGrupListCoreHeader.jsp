<%-- ========= FITXER AUTOGENERAT - NO MODIFICAR !!!!! --%>
<%@ include file="/WEB-INF/jsp/moduls/includes.jsp"%>
<un:useConstants var="ConfiguracioGrupFields" className="es.caib.digitalib.model.fields.ConfiguracioGrupFields"/>
  


        <c:forEach var="__entry" items="${__theFilterForm.additionalFields}">
        <c:if test="${ __entry.key < 0 && ((empty __entry.value.searchBy)? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.searchBy)) && ((empty __entry.value.groupBy )? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.groupBy ))}">
        <th>
        ${dib:getSortIconsAdditionalField(__theFilterForm,__entry.value)}
        </th>
        </c:if>
        </c:forEach>

        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.CONFIGURACIOGRUPID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.CONFIGURACIOGRUPID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.NOM)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.NOM)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.SUPORTWEB)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.SUPORTWEB)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.SUPORTEMAIL)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.SUPORTEMAIL)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.SUPORTTELEFON)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.SUPORTTELEFON)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.LOGOHEADERID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.LOGOHEADERID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.LOGOFOOTERID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.LOGOFOOTERID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.ADREZA)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.ADREZA)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.CODIDIR3PERDEFECTE)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.CODIDIR3PERDEFECTE)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILNOMESESCANEIGID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILNOMESESCANEIGID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILNOMESESCANEIG2ID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILNOMESESCANEIG2ID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILCOPIAAUTENTICAID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILCOPIAAUTENTICAID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILCOPIAAUTENTICA2ID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILCOPIAAUTENTICA2ID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILCUSTODIAID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILCUSTODIAID)}</th>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,ConfiguracioGrupFields.PERFILCUSTODIA2ID)}">
        <th>${dib:getSortIcons(__theFilterForm,ConfiguracioGrupFields.PERFILCUSTODIA2ID)}</th>
        </c:if>


        <c:forEach var="__entry" items="${__theFilterForm.additionalFields}">
        <c:if test="${ __entry.key >=0 && ((empty __entry.value.searchBy)? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.searchBy)) && ((empty __entry.value.groupBy )? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.groupBy ))}">
        <th>
        ${dib:getSortIconsAdditionalField(__theFilterForm,__entry.value)}
        </th>
        </c:if>
        </c:forEach>

