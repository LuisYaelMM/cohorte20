const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
/* El query selector requiere especificar por id o por classe, 'name' no está especificado 
const $n = document.querySelector('name');
*/
const $n = document.querySelector('.name');
const $b = document.querySelector('.blog');
const $l = document.querySelector('.location');

async function displayUser(username) {
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  /* Se deben usar parentesis chuecos para las variables dentro de strings
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
  */
  $n.textContent = `${data.name}`;
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  /* variable mal escrita 
  n.textContent = `Algo salió mal: ${err}`
  */
  $n.textContent = `Algo salió mal: ${err}`;//es buena practica usar punto y coma
  
}

displayUser('stolinski').catch(handleError);