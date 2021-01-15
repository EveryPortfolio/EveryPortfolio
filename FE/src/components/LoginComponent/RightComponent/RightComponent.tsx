import React, { useState } from 'react';
import { useRouter } from 'next/router';
import { RightComponentBackGround, TextDiv, TextInput, Button } from '../../common';
import { Links } from './Links/Links';

export const RightComponent = (): JSX.Element => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const router = useRouter();

  console.log('render Right');

  const onChangeEmail = (e: React.ChangeEvent<HTMLInputElement>) => {
    console.log('change Email');
    setEmail(e.target.value);
  };

  const onChangePassword = (e: React.ChangeEvent<HTMLInputElement>) => {
    console.log('change password');
    setPassword(e.target.value);
  };

  const onClick = (e: React.MouseEvent<HTMLButtonElement, MouseEvent>) => {
    e.preventDefault();
    console.log('click button');
    setEmail('');
    setPassword('');
    router.push('/');
  };

  return (
    <RightComponentBackGround>
      <TextDiv size='80px' margin='0px' text='LOGIN' />
      <TextInput placeholder='Email' inputType='text' value={email} onChange={onChangeEmail} />
      <TextInput placeholder='Password' inputType='password' value={password} onChange={onChangePassword} />
      <Button eventHandler={onClick} text='LOGIN' />
      <Links />
    </RightComponentBackGround>
  );
};
