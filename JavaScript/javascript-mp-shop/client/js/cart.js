


const cartBtn = document.getElementById('cart-btn')

const displayCart = ()=>{
    modalContainer.innerHTML = ""
    modalContainer.styles.display = "block"
    modalOverlay.style.display = "block"








    modalClose.addEventListener("click", ()=>{
        modalContainer.style.display = "none"
        modalOverlay.style.display = "none"
    })

    const modalTitle = document.createElement("div")
    modalTitle.innerText = 'Cart'
    modalTitle.className = 'modal-title'
    modalHeader.append(modalTitle)

    modalContainer.append(modalHeader)
}


cartBtn.addEventListener("click", displayCart)