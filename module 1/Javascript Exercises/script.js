/**
 * main.js - JavaScript functionality for Local Community Event Portal
 */

console.log("Welcome to the Community Portal");
window.onload = () => {
  alert("Page loaded successfully!");
  const pref = localStorage.getItem("preferredEvent");
  if (pref) document.getElementById("preferredEvent").value = pref;
};

document.getElementById("eventForm").addEventListener("submit", (e) => {
  e.preventDefault();
  document.getElementById("confirmation").innerText = "Thank you for registering!";
});

document.getElementById("feedbackForm").addEventListener("submit", (e) => {
  e.preventDefault();
  document.getElementById("feedbackMsg").innerText = "Feedback submitted successfully!";
});

document.getElementById("phone").addEventListener("blur", () => {
  const phone = document.getElementById("phone").value;
  if (!/^[0-9]{10}$/.test(phone)) {
    alert("Please enter a valid 10-digit phone number.");
  }
});

document.getElementById("eventTypeFeedback").addEventListener("change", () => {
  const event = document.getElementById("eventTypeFeedback").value;
  const feeInfo = {
    cleanup: "No fee – Volunteer event.",
    marathon: "$20 registration fee.",
    workshop: "$10 participation fee."
  };
  document.getElementById("feeInfo").innerText = feeInfo[event] || "";
});

document.getElementById("feedbackText").addEventListener("keyup", () => {
  const count = document.getElementById("feedbackText").value.length;
  document.getElementById("charCount").innerText = count;
});

function enlargeImage(img) {
  img.style.width = "500px";
  img.style.height = "auto";
}

function showVideoReadyMessage() {
  document.getElementById("videoMessage").innerText = "Video ready to play!";
}

function savePreference() {
  const selected = document.getElementById("preferredEvent").value;
  if (selected) {
    localStorage.setItem("preferredEvent", selected);
    document.getElementById("savedPrefMsg").innerText = "Preference saved!";
  }
}

function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  document.getElementById("savedPrefMsg").innerText = "Preferences cleared!";
}

function findLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition, showError, { enableHighAccuracy: true });
  } else {
    document.getElementById("locationResult").innerText = "Geolocation is not supported.";
  }
}

function showPosition(position) {
  document.getElementById("locationResult").innerText =
    `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
}

function showError(error) {
  let message = "Unable to retrieve your location.";
  if (error.code === error.PERMISSION_DENIED) message = "Location access denied.";
  else if (error.code === error.TIMEOUT) message = "Request timed out.";
  document.getElementById("locationResult").innerText = message;
}
