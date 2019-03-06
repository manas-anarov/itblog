import React from 'react';
import { Text, View, Button} from 'react-native';

export default class App extends React.Component {
  json_function = () => {
    fetch('http://192.168.8.101:8000/post/delete/5/', {
    method: 'DELETE',
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
      <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
        <Text>Django Rest + React Native</Text>              
        <Button       
          title="Start"
          onPress={this.json_function}
        />
      </View>


    );
  }
}