
let  nombre = process.env.NOMBRE || 'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola ' + nombre);
console.log('Mi web es: '+web);

//$env:NOMBRE="Ariel"; node enotorno.js
//$env:WEB="vamosair.com"; node enotorno

// console.log('Última parte');
console.log('Última ejecución');