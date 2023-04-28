import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { loginUser } from '../../../_actions/user_action';

const LoginPage = () => {
    return (
        <div>
            <form>
                <label>Email</label>
                <input type='text' />
                <label>Password</label>
                <input type='password' />
                <br />
                <button formAction='http://localhost:8080/login'>
                    Login
                </button>
            </form>
        </div>
    )
}

export default LoginPage;