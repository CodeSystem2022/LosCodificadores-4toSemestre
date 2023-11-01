
function hola(nombre){
    return new Promise(function (resolve, reject){
      setTimeout(function (){
        console.log('Hola '+nombre);
        resolve(nombre);
    }, 1000)      
    });
    
}

function hablar(nombre){
    
        setTimeout(function() {
        console.log('bla bla bla bla');
        resolve(nombre);
    }, 1000);
    });    
}

function adios(nombre){
    
       setTimeout( function(){
        console.log('Adios '+nombre);
       // resolve();
       reject('Hay un error');
    }, 1000); 
    });
    
}