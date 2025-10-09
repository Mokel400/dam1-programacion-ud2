public class GestorTareas {
    
    
    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓


        System.out.println("EJERCICIO 1");
        saludo("Mikel");


        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓


        System.out.println("EJERCICIO 2");
        int suma = duracion(30, 45);
        System.out.println(suma);
        

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 3");
        horas(150);


        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.

        // Tu código aquí ↓


        System.out.println("EJERCICIO 4");
        prioridad("Mirar el correo", 1);
        

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 5");
        completado(true);
        completado(false);


        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.

        // Tu código aquí ↓


        System.out.println("EJERCICIO 6");
        porcentaje(10, 7);
        

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola {usuario} completaste {numero} de tareas"
        //   que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓


        System.out.println("EJERCICIO 7");
        saludo();
        saludo("Mikel", 0);
        

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 8");
    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓


    //EJERCICIO 1
    public static void saludo(String nombre) {} 

    //EJERCICIO 2
    public static int duracion(int tarea1, int tarea2) {
        return tarea1 + tarea2;}
        

    //EJERCICIO 3
    public static void horas(int minutos){
        int horas = (minutos / 60);
        int minutosRestantes = (minutos % 60);
        System.out.println("Son " + horas + " horas y " + minutosRestantes + " minutos.");
    }

    //EJERCICIO 4
    public static void prioridad(String tarea, int prioridad){
        System.out.println("📌 [Prioridad" + prioridad + "]" + tarea);
    }

    //EJERCICIO 5
    public static String completado(boolean completada){
        if (completada){
            return"✅ Completada";
        } else {
            return"⏳ Pendiente";
        }
        }

    //EJERCICIO 6
    public static void porcentaje(int tareas, int completadas){
        double porcentaje = (tareas * completadas) / 100;
        System.out.println("Has completado el " + porcentaje + "% de tus tareas.");

    }

    //EJERCICIO 7
    public static String saludo(){
        return "Hola crack";
    }
    public static String saludo(String nombre, int numero){
        return "Hola " + nombre + ", te quedan " + numero + " tareas pendientes.";
    }

    //EJRCICIO 8
    public static String planificación(String nombreTarea, int duracion){
        int horas = duracion / 60;
        int minutos = duracion % 60;
        return "La tarea " + nombreTarea + " durará " + horas + " horas y " + minutos + " minutos aproximadamente.";
    }
}
