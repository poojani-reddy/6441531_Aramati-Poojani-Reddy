// Sample event list
const events = [
  { id: 1, name: "Music Fest", date: "2025-06-10", contact: "music@portal.com" },
  { id: 2, name: "Art Workshop", date: "2025-07-15", contact: "art@portal.com" },
];

// Clone event list with spread operator
const clonedEvents = [...events];

// Function with default parameter & destructuring
function displayEvent({ name, date, contact } = {}) {
  console.log(`Event: ${name}\nDate: ${date}\nContact: ${contact}`);
}

// Use let and const properly
for (let event of clonedEvents) {
  displayEvent(event);
}
