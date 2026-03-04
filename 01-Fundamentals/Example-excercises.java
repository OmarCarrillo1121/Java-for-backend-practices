//FORMAT TEXT
//%s (string) %d (integer) %f (float)
String nombre = "Omar";
int edad = 33;
double valor = 25.512;
System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy generé %.2f dolares", nombre, edad, valor));

//FORMAT WITHIN A TEXT BLOCK
String nombre = “Ruben”;
int aulas = 4;

String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre, aulas);

System.out.println(mensaje);

//CASTING
// Convert bewtween data types
// Implicit cast
int x = 10;
double y = x;

// Explicit cast
double x = 10.5;
int y = (int) x;
