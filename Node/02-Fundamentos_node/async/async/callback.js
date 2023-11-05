function soyAsincrona(niCallback){
    setTimeout(function() {
        console.log('Hola, soy una función asíncrona');
        miCallback();
    }, 1000);  
}

console.log('Iniciando el proceso...');
soyAsincrona(function() {
    console.log('Terminado el proceso...');
});
