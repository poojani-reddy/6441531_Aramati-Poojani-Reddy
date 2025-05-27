// Sample events array
const events = [
  { id: 1, name: "Local Art Festival", date: "2025-06-15", seats: 5, category: "Art" },
  { id: 2, name: "Music Concert", date: "2025-11-10", seats: 20, category: "Music" },
  { id: 3, name: "Food Expo", date: "2025-12-01", seats: 10, category: "Food" },
];

// Function to add an event
function addEvent(newEvent) {
  events.push(newEvent);
  console.log(`Event "${newEvent.name}" added!`);
}

// Closure to track total registrations per category
function registrationTracker(category) {
  let totalRegistrations = 0;
  return function registerUser(event) {
    if (event.category === category && event.seats > 0) {
      event.seats--;
      totalRegistrations++;
      console.log(`Registered for ${event.name} in ${category} category.`);
      console.log(`Total registrations for ${category}: ${totalRegistrations}`);
    } else if (event.category === category) {
      console.log(`No seats left for ${event.name} in ${category} category.`);
    }
  };
}

// Higher-order function to filter events by category using a callback
function filterEventsByCategory(eventsList, callback) {
  return eventsList.filter(callback);
}

// Usage:

// Add a new event
addEvent({ id: 4, name: "Jazz Night", date: "2025-07-20", seats: 15, category: "Music" });

// Create a registration function specifically for "Music" category
const registerMusicEvent = registrationTracker("Music");

// Register some users
registerMusicEvent(events[1]); // Music Concert
registerMusicEvent(events[3]); // Jazz Night

// Filter events dynamically
const musicEvents = filterEventsByCategory(events, event => event.category === "Music");
console.log("Filtered Music Events:", musicEvents);
