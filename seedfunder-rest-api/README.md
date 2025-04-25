# SeedFunder REST API

## Overview
The SeedFunder REST API is designed to manage investor data for a funding platform. It provides endpoints to add, delete, and update investor information.

## Project Structure
```
seedfunder-rest-api
├── src
│   ├── app.ts
│   ├── controllers
│   │   ├── investorController.ts
│   ├── routes
│   │   ├── investorRoutes.ts
│   └── models
│       ├── investorModel.ts
├── package.json
├── tsconfig.json
└── README.md
```

## Installation
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/seedfunder-rest-api.git
   ```
2. Navigate to the project directory:
   ```
   cd seedfunder-rest-api
   ```
3. Install the dependencies:
   ```
   npm install
   ```

## Usage
To start the server, run:
```
npm start
```

The API will be available at `http://localhost:3000`.

## API Endpoints

### Add New Investor
- **Endpoint:** `POST /investors`
- **Description:** Adds a new investor to the database.
- **Request Body:**
  ```json
  {
    "name": "Investor Name",
    "email": "investor@example.com",
    "investmentAmount": 10000
  }
  ```

### Delete Existing Investor
- **Endpoint:** `DELETE /investors/{id}`
- **Description:** Deletes an existing investor by ID.

### Update Existing Investor
- **Endpoint:** `PUT /investors/{id}`
- **Description:** Updates the details of an existing investor.
- **Request Body:**
  ```json
  {
    "name": "Updated Investor Name",
    "email": "updated@example.com",
    "investmentAmount": 15000
  }
  ```

## License
This project is licensed under the MIT License.