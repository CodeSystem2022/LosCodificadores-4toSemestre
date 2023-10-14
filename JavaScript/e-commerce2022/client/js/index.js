

















    buyButton.addEventListener("click",()=>{
        const repeat = cart.some((repeatProduct) => repeatProduct.id === product.id)
        if(repeat){
            cart.map((prod)=>{
                if(prod.id === product.id){
                    prod.quanty++
                }
            })
        }else{
            //agregar cart.push dentro del else
        }
    })