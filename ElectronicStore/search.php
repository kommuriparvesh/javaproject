<?php

define("DB_HOST", "DESKTOP-TCSL3MU");
define("DB_NAME", "electronicstores");
define("DB_CHARSET", "utf8");
define("DB_USER", "master");
define("DB_PASSWORD", "");

try {
  $pdo = new PDO(
    "mysql:host=".DB_HOST.";charset=".DB_CHARSET.";dbname=".DB_NAME,
    DB_USER, DB_PASSWORD, [
      PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
      PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC
    ]
  );
} catch (Exception $ex) { 
      exit($ex->getMessage()); 
    }


$stmt = $pdo->prepare("SELECT * FROM `ElectroniData` WHERE `categories` LIKE ? OR `Mobile` LIKE ?");
$stmt->execute(["%".$_POST["search"]."%", "%".$_POST["search"]."%"]);
$res = $stmt->fetchAll();
if (isset($_POST["ajax"])) { 
    echo json_encode($res); 
  }
