<!DOCTYPE html>
<html>
  <body>
    <form method="post" action="electronics.php">
      <h1>Electronics</h1>
      <input type="text" name="elec" required/>
      <input type="submit" value="elec"/>
    </form>

    <?php
    
    if (isset($_POST["elec"])) {
      require "electronics.php";

      
      if (count($res) > 0) 
      { 
          foreach ($results as $r) 
          {
              printf("<div>%s - %s</div>", $r["name"], $r["specifications"]);
          }
       } else 
      { 
          echo "No results found"; 
      }
    }
    ?>
  </body>
</html>