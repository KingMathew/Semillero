<#list tablas as tabla>
  CREATE TABLE ${tabla.nombre} (
    <#list tabla.atributos as atributo>
       ${atributo.nombre} varchar(30) NOT NULL,
     </#list> 
  );
</#list>
