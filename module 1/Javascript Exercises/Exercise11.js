const form = document.getElementById('registrationForm');

  form.addEventListener('submit', function(e) {
    e.preventDefault(); // Prevent page reload

    // Clear previous errors
    document.querySelectorAll('.error').forEach(el => el.textContent = '');

    const name = form.elements.name.value.trim();
    const email = form.elements.email.value.trim();
    const selectedEvent = form.elements.event.value;

    let isValid = true;

    if (!name) {
      document.getElementById('nameError').textContent = 'Name is required.';
      isValid = false;
    }

    if (!email || !/\S+@\S+\.\S+/.test(email)) {
      document.getElementById('emailError').textContent = 'Valid email is required.';
      isValid = false;
    }

    if (!selectedEvent) {
      document.getElementById('eventError').textContent = 'Please select an event.';
      isValid = false;
    }

    if (isValid) {
      alert(`Thank you for registering, ${name}!`);
      // Here you can add further logic like sending data to server
      form.reset();
    }
  });