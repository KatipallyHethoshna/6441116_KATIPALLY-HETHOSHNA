console.log("Welcome to the Community Portal");

window.onload = function () {
    alert("Page is fully loaded!");
    displayEvents();
};

function displayEvents() {
    const eventContainer = document.getElementById("eventList");
    eventContainer.innerHTML = "";

    events.forEach(event => {
        if (isUpcoming(event.date) && event.seats > 0) {
            const col = document.createElement("div");
            col.className = "col-md-4";

            const card = document.createElement("div");
            card.className = "card mb-3";

            const cardBody = `
        <div class="card-body">
          <h5 class="card-title">${event.name}</h5>
          <p class="card-text"><strong>Date:</strong> ${event.date}</p>
          <p class="card-text"><strong>Location:</strong> ${event.location}</p>
          <p class="card-text"><strong>Seats Left:</strong> ${event.seats}</p>
          <button class="btn btn-primary" onclick="registerUser(${event.id})">Register</button>
        </div>
      `;
            card.innerHTML = cardBody;
            col.appendChild(card);
            eventContainer.appendChild(col);
        }
    });
}

function isUpcoming(dateStr) {
    const today = new Date();
    const eventDate = new Date(dateStr);
    return eventDate >= today;
}

function registerUser(eventId) {
    try {
        const event = events.find(e => e.id === eventId);
        if (event && event.seats > 0) {
            event.seats--;
            alert(Registered for ${ event.name });
            displayEvents();
        } else {
            alert("No seats available!");
        }
    } catch (error) {
        console.error("Registration failed", error);
    }
}