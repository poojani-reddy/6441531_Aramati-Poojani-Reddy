const events = [
  { id: 1, name: "Workshop on Baking", category: "workshop", seats: 10 },
  { id: 2, name: "Jazz Night", category: "music", seats: 5 },
  { id: 3, name: "Painting Exhibition", category: "exhibition", seats: 0 }
];

const container = document.querySelector('#eventsContainer');
const categoryFilter = document.querySelector('#categoryFilter');
const searchInput = document.querySelector('#searchInput');

function renderEvents(filteredEvents) {
  container.innerHTML = '';

  filteredEvents.forEach(event => {
    const card = document.createElement('div');
    card.className = 'eventCard';

    const title = document.createElement('h3');
    title.textContent = event.name;
    card.appendChild(title);

    const seats = document.createElement('p');
    seats.textContent = `Seats: ${event.seats}`;
    card.appendChild(seats);

    const registerBtn = document.createElement('button');
    registerBtn.textContent = 'Register';
    registerBtn.disabled = event.seats === 0;
    card.appendChild(registerBtn);

    registerBtn.onclick = () => {
      if (event.seats > 0) {
        event.seats--;
        filterAndRender();
      }
    };

    container.appendChild(card);
  });
}

function filterAndRender() {
  const category = categoryFilter.value.toLowerCase();
  const searchTerm = searchInput.value.toLowerCase();

  let filtered = events;

  if (category) {
    filtered = filtered.filter(e => e.category === category);
  }

  if (searchTerm) {
    filtered = filtered.filter(e => e.name.toLowerCase().includes(searchTerm));
  }

  renderEvents(filtered);
}

// Filter events on category change
categoryFilter.onchange = filterAndRender;

// Filter events on keydown in search input
searchInput.onkeydown = (e) => {
  // Optional: run on keyup instead for smoother UX
  setTimeout(filterAndRender, 100);
};

// Initial render
renderEvents(events);
