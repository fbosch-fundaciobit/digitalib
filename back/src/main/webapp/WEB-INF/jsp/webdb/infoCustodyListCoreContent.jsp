<%-- ========= FITXER AUTOGENERAT - NO MODIFICAR !!!!! --%>
<%@ include file="/WEB-INF/jsp/moduls/includes.jsp"%>
<un:useConstants var="InfoCustodyFields" className="es.caib.digitalib.model.fields.InfoCustodyFields"/>



        <!--  /** Additional Fields */  -->
        <c:forEach var="__entry" items="${__theFilterForm.additionalFields}" >
        <c:if test="${ __entry.key < 0  && ((empty __entry.value.searchBy)? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.searchBy)) && ((empty __entry.value.groupBy )? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.groupBy ))}">
          <td>
             <c:if test="${not empty __entry.value.valueMap }">
               <c:out escapeXml="${__entry.value.escapeXml}" value="${__entry.value.valueMap[infoCustody.infoCustodyID]}" />
             </c:if>
             <c:if test="${not empty __entry.value.valueField }">
               <c:set var="__tmp" value="${pageScope}" />
               <c:set var="__trosos" value="${fn:split(__entry.value.valueField.fullName,'.')}" />
               <c:forEach var="__tros" items="${__trosos}">
                  <c:set var="__tmp" value="${__tmp[__tros]}" />
               </c:forEach>
               <c:out escapeXml="${__entry.value.escapeXml}" value="${__tmp}" />
             </c:if>
          </td>
          </c:if>
          </c:forEach>


        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.INFOCUSTODYID)}">
          <td>
          ${infoCustody.infoCustodyID}
          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.CUSTODYID)}">
          <td>
          ${infoCustody.custodyId}
          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.ARXIUEXPEDIENTID)}">
          <td>
          ${infoCustody.arxiuExpedientId}
          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.ARXIUDOCUMENTID)}">
          <td>
          ${infoCustody.arxiuDocumentId}
          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.FILEURL)}">
          <td>
                       <c:if test="${ not empty infoCustody.fileUrl}">
               <a href="${infoCustody.fileUrl}" target="_blank">${infoCustody.fileUrl}</a>
             </c:if>

          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.CSV)}">
          <td>
          ${infoCustody.csv}
          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.CSVVALIDATIONWEB)}">
          <td>
                       <c:if test="${ not empty infoCustody.csvValidationWeb}">
               <a href="${infoCustody.csvValidationWeb}" target="_blank">${infoCustody.csvValidationWeb}</a>
             </c:if>

          </td>
        </c:if>
        <c:if test="${!gen:contains(__theFilterForm.hiddenFields,InfoCustodyFields.CSVGENERATIONDEFINITION)}">
          <td>
          ${infoCustody.csvGenerationDefinition}
          </td>
        </c:if>


        <!--  /** Additional Fields */  -->
        <c:forEach var="__entry" items="${__theFilterForm.additionalFields}" >
        <c:if test="${ __entry.key >= 0  && ((empty __entry.value.searchBy)? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.searchBy)) && ((empty __entry.value.groupBy )? true : !gen:contains(__theFilterForm.hiddenFields, __entry.value.groupBy ))}">
          <td>
             <c:if test="${not empty __entry.value.valueMap }">
               <c:out escapeXml="${__entry.value.escapeXml}" value="${__entry.value.valueMap[infoCustody.infoCustodyID]}" />
             </c:if>
             <c:if test="${not empty __entry.value.valueField }">
               <c:set var="__tmp" value="${pageScope}" />
               <c:set var="__trosos" value="${fn:split(__entry.value.valueField.fullName,'.')}" />
               <c:forEach var="__tros" items="${__trosos}">
                  <c:set var="__tmp" value="${__tmp[__tros]}" />
               </c:forEach>
               <c:out escapeXml="${__entry.value.escapeXml}" value="${__tmp}" />
             </c:if>
          </td>
          </c:if>
          </c:forEach>


