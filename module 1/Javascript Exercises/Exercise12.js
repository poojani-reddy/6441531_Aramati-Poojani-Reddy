const form = document.getElementById('registrationForm');
  const messageDiv = document.getElementById('message');

  form.addEventListener('submit', function(e) {
    e.preventDefault();

    // Clear errors and messages
    document.querySelectorAll('.error').forEach(el => el.textContent = '');
    messageDiv.textContent = '';

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

    if (!isValid) return;

    const userData = { name, email, event: selectedEvent };

    // Show loading message
    messageDiv.textContent = 'Submitting...';

    // Simulate delayed fetch POST request with setTimeout
    setTimeout(() => {
      fetch('https://jsonplaceholder.typicode.com/posts', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(userData)
      })
      .then(response => {
        if (!response.ok) throw new Error('Network response was not ok');
        return response.json();
      })
      .then(data => {
        messageDiv.textContent = `Registration successful! Your ID is ${data.id}`;
        form.reset();
      })
      .catch(error => {
        messageDiv.textContent = 'Registration failed. Please try again.';
        console.error('Error:', error);
      });
    }, 1500); // 1.5 seconds delay to simulate server response
  });