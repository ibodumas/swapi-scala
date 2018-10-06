import java.io.{File, PrintWriter}

var url: Any = "https://swapi.co/api/people"

try{
  var req = requests.get(url.toString)
  if(req.statusCode == 200){
    val writer = new PrintWriter(new File("swap_api_data.txt"))
    writer.write(req.text)
    writer.close()
    print(req.text)
  }
  else{
    throw new Exception("Respose Code => " + req.statusCode)
  }
}
catch{
  case e: Exception => "Fatal Error"
}

