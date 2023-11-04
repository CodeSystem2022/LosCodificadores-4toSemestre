// La palabra async no es necesria en las funciones, porque ya son asincronas
// Igual proyectar una sincronia visual
async function hola(nombre){
    return new Promise(function (resolve, reject){
      setTimeout(function (){
        console.log('Hola '+nombre);
        resolve(nombre);
    }, 1000)      
    });
    
}

async function hablar(nombre){
    return new Promise((resolve, reject) => { // usamos la sintaxis ES6
        setTimeout(function() {
        console.log('bla bla bla bla');
        resolve(nombre);
    }, 1000);
    });    
}

async function adios(nombre){
    return new Promise((resolve, reject) => {
       setTimeout( function(){
        console.log('Adios '+nombre);
       // resolve();
       reject('Hay un error');
    }, 1000); 
    });
}

//await hola('Ariel'); // esto no se debe utilizar
// await solo es valido dentro de una funcion asincrona
async function main(){
    let nombre = await hola('Ariel');
    await hablar();
    await hablar();
    await hablar();
    await adios(nombre);
    console.log('Terminamos el proceso...');

}

console.log('Empezamos el proceso...');
main();
console.log('Esta va a sr la segunda instruccion'); 