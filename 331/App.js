import React from 'react';
import { Text, 
  View, 
  Button,
  AppRegistry,
  StyleSheet,
  ListView} from 'react-native';

export default class App extends React.Component {
 
componentDidMount(){
    this.getType()
  }

  constructor() {
    super();
    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
    this.state = {
      dataSource: ds,
    };
  }

  getType(){
    fetch('http://192.168.8.101:8000/post/list')
    .then((response) => response.json())
    .then((response) =>{
        this.setState({
          dataSource: this.state.dataSource.cloneWithRows(response)
        });
    });
  }

  renderRow(post){
     return (
     <View style={styles.MyViewStyle}>
        <Text style={styles.MyTextStyle}>{post.title}</Text>
     </View>
     );
  }

  render() {
    return (
      <ListView
        dataSource={this.state.dataSource}
        renderRow={this.renderRow.bind(this)}
      />
    );
  }



}

const styles = StyleSheet.create({
   MyViewStyle: {
        flex: 1, justifyContent: "center", alignItems: "center", marginTop: 25 
    },
    MyTextStyle: {
        fontSize: 30,
        color: 'red',
    }
});




