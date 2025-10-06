import utilidades.CuentaBancaria;
public class Main {
    public static void main(String[] args) {
        
    CuentaBancaria c1 = new CuentaBancaria();
        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 1");
        //System.out.println(c1.saldo);


        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 2");
        c1.depositar(100);
        c1.retirar(30);
        c1.getSaldo();


        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        

        System.out.println("EJERCICIO 3");
        //c1.registrarOperacion("Hackeo", 9999);



        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.


        System.out.println("EJERCICIO 4");
        c1.depositar(3000);
        c1.retirar(2000);
        c1.getSaldo();
        c1.retirar(9999);
    }

}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Porque el atributo saldo es privado

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Porque son metodos públicos

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: Es un error que indica que el método es privado

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
    //Que no se puede acceder a el ni modificar su valor desde fuera
// - ¿Qué pasaría si saldo fuera public?
    //Que habría un problema de seguridad
// - ¿Por qué registrarOperacion es private en lugar de public?
    //Por que hace cambios en los atributos
