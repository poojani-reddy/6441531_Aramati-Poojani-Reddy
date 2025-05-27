const events = [
  { name: "Local Art Festival", date: "2025-06-15", seats: 5 },
  { name: "Music Concert", date: "2024-11-10", seats: 0 }, // full event
  { name: "Food Expo", date: "2023-12-01", seats: 10 },   // past event (assuming today is 2024+)
];

// Get today's date for comparison
const today = new Date();

events.forEach(event => {
  const eventDate = new Date(event.date);
  
  // Only show events that are upcoming and have seats available
  if (eventDate >= today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name} on ${event.date}, Seats available: ${event.seats}`);
  } else {
    console.log(`Skipping event: ${event.name} (either full or past)`);
  }
});

// Registration function with error handling
function register(event) {
  try {
    if (event.seats <= 0) {
      throw new Error(`Registration failed: No seats available for ${event.name}`);
    }
    event.seats--;
    console.log(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } catch (error) {
    console.error(error.message);
  }
}

// Example usage:
register(events[0]); // Should succeed
register(events[1]); // Should throw error: no seats available
