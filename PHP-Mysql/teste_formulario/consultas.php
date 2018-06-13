<?php

include_once("conexao.php");

$filtro = isset($_GET['filtro'])?$_GET['filtro']:"";

$sql = "select * from usuarios where profissao like '%$filtro%'";
$consulta = mysqli_query($conexao, $sql);
$resgistros = mysqli_num_rows($consulta);//


mysqli_close($conexao);

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Sistema de Cadastro</title>
	<link rel="stylesheet" type="text/css" href="_css/estilo.css">
</head>
<body>
	<div class="container">
		<nav>
			<ul class="menu">
				<a href="index.html"><li>Cadastro</li></a>
				<a href="consultas.php"><li>Consultas</li></a>
			</ul>
		</nav>
		<section>
			<h1>Consultas</h1>
			<hr><br><br>
		<form method="get" action="">
			Filtrar por profissão: <input type="text" name="filtro" class="campo">
			<input type="submit" value="Pesquisar" class="btn">
		</form>
			<?php
				print "$resgistros resgistros encontrados";
				while ($exibirRegistros = mysqli_fetch_array($consulta)){
					$codigo = $exibirRegistros[0];
					$nome = $exibirRegistros[1];
					$email = $exibirRegistros[2];
					$profissao = $exibirRegistros[3];
					
					print "<article>";
				
					print "$codigo <br>";
					print "$nome <br>";
					print "$profissao <br>";

					print "</article>";
				}
			?>
		
		</section>
	</div>

</body>
</html>
