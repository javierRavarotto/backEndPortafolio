

# Portafolio backend

Es un `portafolio para poder mostrar otros proyectoc, estudios y hanilidades





## API Reference

#### Get all 

```http
  GET /api/usuario
  GET /api/estudio
  GET /api/habilidad  
  GET /api/proyecto
```
#### Get by id(number)

```http
  GET /api/usuario/${id}
  GET /api/estudio/${id}
  GET /api/habilidad/${id}
  GET /api/proyecto/${id}
```
#### Post 
```http
  POST /api/usuario
  POST /api/usuario/login
  POST /api/estudio
  POST /api/habilidad
  POST /api/proyecto
```

#### Put 
```http
  PUT /api/usuario/${id}
  PUT /api/estudio/${id}
  PUT /api/habilidad/${id}
  PUT /api/proyecto/${id}
```
#### Delete 
```http
  DELETE /api/usuario/${id}
  DELETE /api/estudio/${id}
  DELETE /api/habilidad/${id}
  DELETE /api/proyecto/${id}
```
### Generales
#### buscarId(num)
Retorna una entidad.

#### buscarTodo()
Retorna todas las entidad.

#### crear(entidad)
Crea la entidad.

#### actualizar(entidad)
Actualiza la entidad.

#### borrar(entidad)
Borra la entidad.

### Usuario
#### buscarPorNombre(nombre)
Si encuentra el usuario lo retorna sino retorna un usuario vacio.


## Run Locally

Cambiar en application.yml
```bash
   username: {usuario}
   url: jdbc:mysql://localhost:3306/{base_de_datos}
   password: {password}
```



