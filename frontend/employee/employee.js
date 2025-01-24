async function fetchData() {
    try {

        const id = document.getElementById('employee-id');
        
        // Отправка GET-запроса
        const response = await fetch('http://localhost:8080/api/employees/' + id.value);// Укажите правильный URL для вашего API
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        // Обработка JSON-ответа
        const data = await response.json();

        // Создание карточки из данных
        const resultDiv = document.getElementById('result');
        resultDiv.innerHTML = `
            <div class="card">
                <p><strong>Name:</strong> ${data.name}</p>
                <p><strong>Salary:</strong> ${data.email}</p>
                <p><strong>Department:</strong> ${data.department}</p>
                <p><strong>Position:</strong> ${data.position}</p>
                <p><strong>Address:</strong> ${data.address}</p>
                <p><strong>Hire date:</strong> ${data.hire_date}</p>
                <p><strong>Age:</strong> ${data.age}</p>
            </div>
        `;
    } catch (error) {
        console.error('Error fetching data:', error);
    }
}