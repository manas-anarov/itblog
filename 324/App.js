import React from 'react';
import { Text, View, Button} from 'react-native';

export default class App extends React.Component {
  json_function = () => {
    fetch('http://192.168.0.112:8000/post/create/', {
    method: 'POST',
    headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
  body: JSON.stringify({
    title: 'Title React Native',
    text: 'Text React Native',
  }),
  });
  }
  render() {
    return (
      <View>
      <Text>Yii Rest + React Native</Text>              
        <Button       
          title="Go"
          onPress={this.json_function}
        />
      </View>   
    );
  }
}