
from logger_base import log








    if opcion == 1:
        usuarios = UsuarioDAO.seleccionar()
        for usuario in usuarios:
            log.info(usuario)
else:
    log.info('Salimos de la aplicación, hasta pronto!!')