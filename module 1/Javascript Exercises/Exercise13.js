form.addEventListener('submit', function(e) {
  e.preventDefault();
  console.log('Form submission started');

  const name = form.elements.name.value.trim();
  const email = form.elements.email.value.trim();
  const selectedEvent = form.elements.event.value;
  console.log('Input values:', { name, email, selectedEvent });

  // Validate inputs...
  // After preparing data for fetch:
  console.log('User data ready to send:', userData);
});