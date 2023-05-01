import React, { useState } from "react";

const LoginView = (props) => {
  const [userId, setEmail] = useState("");
  const [pass, setPassword] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();

    fetch("http://localhost:8080/login", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ userId, pass }),
    })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("로그인이 실패했습니다.");
        }
      })
      .then((data) => {
        console.log(data);
        // 로그인이 성공했을 때의 처리를 여기에 작성합니다.

      })
      .catch((error) => {
        console.log(error.message);
        // 로그인이 실패했을 때의 처리를 여기에 작성합니다.
      });
  };

  return (
    <form onSubmit={handleSubmit}>
    <div>
      <label htmlFor="email">Email</label>
      <input
        type="text"
        id="email"
        value={userId}
        onChange={(event) => setEmail(event.target.value)}
        required
      />
    </div>
    <div>
      <label htmlFor="password">Password</label>
      <input
        type="password"
        id="password"
        value={pass}
        onChange={(event) => setPassword(event.target.value)}
        required
      />
    </div>
    <button type="submit">로그인</button>
  </form>
  );
}

export default LoginView;