// Use const for event name and date (fixed values)
const eventName = "Local Art Festival";
const eventDate = "2025-06-15";

// Use let for available seats (will change)
let availableSeats = 50;

// Concatenate event info using template literals
console.log(`Event: ${eventName} is on ${eventDate}. Seats available: ${availableSeats}`);

// Simulate a registration — decrease seat count
availableSeats--;
console.log(`After one registration, seats left: ${availableSeats}`);

// Simulate a cancellation — increase seat count
availableSeats++;
console.log(`After one cancellation, seats left: ${availableSeats}`);
