// Sample events array
const events = [
  { id: 1, name: "Workshop on Baking", seats: 10 },
  { id: 2, name: "Jazz Night", seats: 5 },
  { id: 3, name: "Painting Exhibition", seats: 0 }
];

// Access the container
const container = document.querySelector('#eventsContainer');

// Function to render events
function renderEvents() {
  container.innerHTML = ''; // Clear existing content

  events.forEach(event => {
    // Create card div
    const card = document.createElement('div');
    card.className = 'eventCard';
    
    // Event name
    const title = document.createElement('h3');
    title.textContent = event.name;
    card.appendChild(title);

    // Seats info
    const seats = document.createElement('p');
    seats.textContent = `Available Seats: ${event.seats}`;
    card.appendChild(seats);

    // Register button (disabled if no seats)
    const registerBtn = document.createElement('button');
    registerBtn.textContent = 'Register';
    registerBtn.disabled = event.seats === 0;
    card.appendChild(registerBtn);

    // Cancel button
    const cancelBtn = document.createElement('button');
    cancelBtn.textContent = 'Cancel';
    card.appendChild(cancelBtn);

    // Register button click handler
    registerBtn.addEventListener('click', () => {
      if(event.seats > 0) {
        event.seats--;
        renderEvents();  // Update UI
      }
    });

    // Cancel button click handler
    cancelBtn.addEventListener('click', () => {
      event.seats++;
      renderEvents();  // Update UI
    });

    container.appendChild(card);
  });
}

// Initial render
renderEvents();