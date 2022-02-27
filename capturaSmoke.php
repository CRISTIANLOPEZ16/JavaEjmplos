<?php 
date_default_timezone_set('UTC-05:00');
$archivo="visitas.txt";
$refer = $_SERVER['HTTP_REFERER']; 
$fecha = date("d/m/y H:i:s" ) ; 
$proceso=fopen($archivo, "a") or die ("error en el sistema");
$user=$user_agent = $_SERVER['HTTP_USER_AGENT'];
$ip=$_SERVER['REMOTE_ADDR'];
$datos="".$fecha." - ".$ip." - ".$user."  -  ".$refer."\n";

fwrite($proceso,$datos);
fclose($proceso); 

?>