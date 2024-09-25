<%@page import="org.eclipse.jdt.internal.compiler.ast.WhileStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.AtividadeBanco"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script type="text/javascript" src=" https://cdn.datatables.net/2.1.7/js/dataTables.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/2.1.7/js/dataTables.bootstrap5.js"></script>

<link type="text/css" href="https://cdn.datatables.net/2.1.7/css/dataTables.dataTables.css"> 
<link type="text/css" href="https://cdn.datatables.net/2.1.7/css/dataTables.bootstrap5.css"> 
<link type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
    
    

<style type="text/css">

	table {
		border: 1;
	}
</style>
<script type="text/javascript">
	_demo.init({
		libs: {"targetFramework":"bootstrap5","js":["jquery","datatables"],"css":["datatables"],"components":{"datatables":{"css":"https:\/\/cdn.datatables.net\/2.1.7\/css","js":"https:\/\/cdn.datatables.net\/2.1.7\/js","resolve":true},"autofill":{"css":"https:\/\/cdn.datatables.net\/autofill\/2.7.0\/css","js":"https:\/\/cdn.datatables.net\/autofill\/2.7.0\/js","resolve":true},"buttons":{"css":"https:\/\/cdn.datatables.net\/buttons\/3.1.2\/css","js":"https:\/\/cdn.datatables.net\/buttons\/3.1.2\/js","resolve":true},"colreorder":{"css":"https:\/\/cdn.datatables.net\/colreorder\/2.0.4\/css","js":"https:\/\/cdn.datatables.net\/colreorder\/2.0.4\/js","resolve":true},"editor":{"css":"\/extensions\/Editor\/css","js":"\/extensions\/Editor\/js","resolve":true},"fixedcolumns":{"css":"https:\/\/cdn.datatables.net\/fixedcolumns\/5.0.1\/css","js":"https:\/\/cdn.datatables.net\/fixedcolumns\/5.0.1\/js","resolve":true},"fixedheader":{"css":"https:\/\/cdn.datatables.net\/fixedheader\/4.0.1\/css","js":"https:\/\/cdn.datatables.net\/fixedheader\/4.0.1\/js","resolve":true},"keytable":{"css":"https:\/\/cdn.datatables.net\/keytable\/2.12.1\/css","js":"https:\/\/cdn.datatables.net\/keytable\/2.12.1\/js","resolve":true},"responsive":{"css":"https:\/\/cdn.datatables.net\/responsive\/3.0.3\/css","js":"https:\/\/cdn.datatables.net\/responsive\/3.0.3\/js","resolve":true},"rowgroup":{"css":"https:\/\/cdn.datatables.net\/rowgroup\/1.5.0\/css","js":"https:\/\/cdn.datatables.net\/rowgroup\/1.5.0\/js","resolve":true},"rowreorder":{"css":"https:\/\/cdn.datatables.net\/rowreorder\/1.5.0\/css","js":"https:\/\/cdn.datatables.net\/rowreorder\/1.5.0\/js","resolve":true},"scroller":{"css":"https:\/\/cdn.datatables.net\/scroller\/2.4.3\/css","js":"https:\/\/cdn.datatables.net\/scroller\/2.4.3\/js","resolve":true},"select":{"css":"https:\/\/cdn.datatables.net\/select\/2.1.0\/css","js":"https:\/\/cdn.datatables.net\/select\/2.1.0\/js","resolve":true},"searchbuilder":{"css":"https:\/\/cdn.datatables.net\/searchbuilder\/1.8.0\/css","js":"https:\/\/cdn.datatables.net\/searchbuilder\/1.8.0\/js","resolve":true},"searchpanes":{"css":"https:\/\/cdn.datatables.net\/searchpanes\/2.3.2\/css","js":"https:\/\/cdn.datatables.net\/searchpanes\/2.3.2\/js","resolve":true},"staterestore":{"css":"https:\/\/cdn.datatables.net\/staterestore\/1.4.1\/css","js":"https:\/\/cdn.datatables.net\/staterestore\/1.4.1\/js","resolve":true},"datetime":{"css":"https:\/\/cdn.datatables.net\/datetime\/1.5.4\/css\/dataTables.dateTime.min.css","js":"https:\/\/cdn.datatables.net\/datetime\/1.5.4\/js\/dataTables.dateTime.min.js"},"bootstrap":{"css":"https:\/\/maxcdn.bootstrapcdn.com\/bootstrap\/3.3.7\/css\/bootstrap.min.css","js":"https:\/\/maxcdn.bootstrapcdn.com\/bootstrap\/3.3.7\/js\/bootstrap.min.js"},"bootstrap4":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/twitter-bootstrap\/4.5.2\/css\/bootstrap.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/popper.js\/1.14.3\/umd\/popper.min.js|https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/twitter-bootstrap\/4.5.2\/js\/bootstrap.min.js"},"bootstrap5":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/twitter-bootstrap\/5.3.0\/css\/bootstrap.min.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/twitter-bootstrap\/5.3.0\/js\/bootstrap.bundle.min.js"},"bulma":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/bulma\/1.0.1\/css\/bulma.min.css"},"foundation":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/foundation\/6.4.3\/css\/foundation.min.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/foundation\/6.4.3\/js\/foundation.min.js"},"jqueryui":{"css":"https:\/\/code.jquery.com\/ui\/1.13.2\/themes\/base\/jquery-ui.css","js":"https:\/\/code.jquery.com\/ui\/1.13.2\/jquery-ui.js"},"material":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/material-components-web\/14.0.0\/material-components-web.min.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/material-components-web\/14.0.0\/material-components-web.min.js"},"semanticui":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/fomantic-ui\/2.9.2\/semantic.min.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/fomantic-ui\/2.9.2\/semantic.min.js"},"uikit":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/uikit\/3.0.2\/css\/uikit.min.css","js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/uikit\/3.0.2\/js\/uikit.min.js"},"tailwindcss":{"css":"","js":"https:\/\/cdn.tailwindcss.com"},"font-awesome":{"css":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/font-awesome\/4.7.0\/css\/font-awesome.min.css"},"world-flags-sprite":{"css":"https:\/\/cdn.jsdelivr.net\/gh\/lafeber\/world-flags-sprite\/stylesheets\/flags32-both.css"},"buttons-html5":{"js":"https:\/\/cdn.datatables.net\/buttons\/3.1.2\/js\/buttons.html5.min.js"},"buttons-colvis":{"js":"https:\/\/cdn.datatables.net\/buttons\/3.1.2\/js\/buttons.colVis.min.js"},"buttons-print":{"js":"https:\/\/cdn.datatables.net\/buttons\/3.1.2\/js\/buttons.print.min.js"},"jquery":{"js":"https:\/\/code.jquery.com\/jquery-3.7.1.js"},"jszip":{"js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/jszip\/3.10.1\/jszip.min.js"},"pdfmake":{"js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/pdfmake\/0.2.7\/pdfmake.min.js"},"vfsfonts":{"js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/pdfmake\/0.2.7\/vfs_fonts.js"},"moment":{"js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/moment.js\/2.29.2\/moment.min.js"},"luxon":{"js":"https:\/\/cdnjs.cloudflare.com\/ajax\/libs\/luxon\/2.3.1\/luxon.min.js"},"sparkline":{"js":"https:\/\/cdn.jsdelivr.net\/gh\/fnando\/sparkline\/dist\/sparkline.js"}}},
		jquery: function () {		
			$('#example').DataTable();
		},
		vanilla: function () {
			new DataTable('#example');
		}
	});
</script>
</head>
<body>


<table id="example" class="table table-striped"  style="width:100%">
<thead> 
	<tr>
		<th>Código</th>
		<th>Nome</th>
		<th>Data Inicio</th>
		<th>Data Termino</th>
		<th>Sala Virtual</th>
		<th>Artefato</th>
	</tr>
</thead>
<tbody>

<% 
			

	AtividadeBanco ab = new AtividadeBanco();
	ResultSet rs = ab.select();
	
	rs.beforeFirst();
	
	String strOut = "";
	while ( rs.next()){ 
		strOut += 
	   	"<tr>"+
	   			"<td>"+ rs.getString("cod")+"</td>"+	   	
	   			"<td>"+ rs.getString("nome")+"</td>"+
	   			"<td>"+ rs.getString("dataInicio")+"</td>"+
	   			"<td>"+ rs.getString("dataTermino")+"</td>"+
	   			"<td>"+ rs.getString("salavirtual")+"</td>"+
	   			"<td>"+ rs.getString("artefatointeratividade")+"</td>"+
		"</tr>";
		
	}
	out.write( strOut );
%>
</tbody>
<tfoot>
	<tr>
		<th>Código</th>
		<th>Nome</th>
		<th>Data Inicio</th>
		<th>Data Termino</th>
		<th>Sala Virtual</th>
		<th>Artefato</th>
	</tr>

</tfoot>
</table>

</body>
</html>