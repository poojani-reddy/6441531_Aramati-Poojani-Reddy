//using promises
const loading = document.getElementById('loading');
const container = document.getElementById('eventsContainer');

function fetchEvents() {
  loading.style.display = 'block';  // Show loading spinner
  fetch('https://mockapi.io/events')  // Replace with actual mock URL
    .then(response => {
      if (!response.ok) throw new Error('Network response was not ok');
      return response.json();
    })
    .then(events => {
      loading.style.display = 'none';  // Hide loading spinner
      renderEvents(events);             // Your render function here
    })
    .catch(error => {
      loading.style.display = 'none';
      container.innerHTML = `<p>Error loading events: ${error.message}</p>`;
    });
}

fetchEvents();

//using async/await
 async function fetchEventsAsync() {
  try {
    loading.style.display = 'block';
    const response = await fetch('https://mockapi.io/events');  // Replace with actual mock URL

    if (!response.ok) throw new Error('Network response was not ok');

    const events = await response.json();
    loading.style.display = 'none';
    renderEvents(events);  // Your render function here
  } catch (error) {
    loading.style.display = 'none';
    container.innerHTML = `<p>Error loading events: ${error.message}</p>`;
  }
}

fetchEventsAsync();
