
const cart = []; // El array vacío es el carrito.










    const buyButton = document.createElement("button");
    buyButton.innerText = "Comprar";

    content.append(buyButton);

    buyButton.addEventListener("click", ()=>{
        cart.push({
            id: product.id,
            productName: product.productName,
            price: product.price,
            quanty: prompt.quanty,
            img: product.img,
        })
        console.log(cart)
    })