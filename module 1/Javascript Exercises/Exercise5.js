// Define Event class (constructor + prototype methods)
class Event {
  constructor(name, date, seats, category) {
    this.name = name;
    this.date = new Date(date);
    this.seats = seats;
    this.category = category;
  }

  // Prototype method to check availability
  checkAvailability() {
    return this.seats > 0;
  }
}

// Create some event instances
const artFest = new Event("Local Art Festival", "2025-06-15", 5, "Art");
const musicConcert = new Event("Music Concert", "2025-11-10", 0, "Music");

// Check availability
console.log(`${artFest.name} available?`, artFest.checkAvailability()); // true
console.log(`${musicConcert.name} available?`, musicConcert.checkAvailability()); // false

// List keys and values of an event using Object.entries()
console.log("Event details:");
Object.entries(artFest).forEach(([key, value]) => {
  console.log(`${key}: ${value}`);
});
