// Initialize an array to hold events
const events = [];

// Add new events using .push()
events.push(
  { name: "Workshop on Baking", category: "Cooking", date: "2025-06-20" },
  { name: "Jazz Night", category: "Music", date: "2025-07-15" },
  { name: "Painting Exhibition", category: "Art", date: "2025-08-10" },
  { name: "Rock Concert", category: "Music", date: "2025-09-05" }
);

// Use .filter() to show only music events
const musicEvents = events.filter(event => event.category === "Music");

// Use .map() to format display cards (event names)
const eventCards = events.map(event => `Event: ${event.name}`);

// Output results
console.log("All events:", events);
console.log("Music events:", musicEvents);
console.log("Event cards:", eventCards);
