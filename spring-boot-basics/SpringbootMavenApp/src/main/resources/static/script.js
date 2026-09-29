async function getGreeting() {

    const nameInput =
        document.getElementById("nameInput");

    const greeting =
        document.getElementById("greeting");

    const name =
        nameInput.value.trim();

    try {

        const response =
            await fetch(
                `/api/greeting?name=${encodeURIComponent(name)}`
            );

        if (!response.ok) {
            throw new Error("Server error");
        }

        const message =
            await response.text();

        greeting.textContent = message;

    } catch (error) {

        greeting.textContent =
            "Unable to contact server.";

        console.error(error);
    }
}


async function updateServerTime() {

    const serverTime =
        document.getElementById("serverTime");

    try {

        const response =
            await fetch("/api/time");

        if (!response.ok) {
            throw new Error("Server error");
        }

        const time =
            await response.text();

        serverTime.textContent =
            "Server time: " + time;

    } catch (error) {

        serverTime.textContent =
            "Server time unavailable.";

        console.error(error);
    }
}


// Update server time every 1 second
setInterval(updateServerTime, 1000);


// Get time immediately when page loads
updateServerTime();