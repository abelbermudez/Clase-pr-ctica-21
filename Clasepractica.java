public class Inventario {

public static void main(string[]args) { 
  Scanner abel= new Scanner(System.in); 

System.out.println("Ingrese la cantidad de productos a registrar:");
Int cantidad= Integer.parselnt(scanner.nextLine()); 

String[] productos =new String[cantidad]; 
for(int i=0;i < cantidad;i++){
System.out.println("Ingrese el nombre del producto " (i+1) + ":")
productos[i]=abel.nextLine();
}
System.out.println("Ingrese el nombre del producto que desea buscar:");
  String productobuscado= abel.nextLine(); 

boolean encontrado=False; 
for (String producto: productos){
  If (producto.equalsIgnoreCase (productobuscado)){ 
      encontrado=true;
      break; 
  {
} 

  If (encontrado){ 
  System.out.println("El producto" + productobuscado + "está disponible."); 
  }else{
  System.out.println("El producto" + productobuscado + "no está disponible."); 
   }
   scanner.close();
  }
}
